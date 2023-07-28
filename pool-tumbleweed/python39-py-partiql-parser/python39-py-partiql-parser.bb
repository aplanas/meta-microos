SUMMARY = "Pure Python PartiQL Parser"
DESCRIPTION = "Pure Python PartiQL Parser"
LICENSE = "MIT"

PV = "0.3.4"

RPM_NAME = "python39-py-partiql-parser-0.3.4-1.1.noarch.rpm"
RPM_HASH = "d7983686e5cf90c0194ad0fd139d9af336ac8b0fef3cc0c3db81ff2392029203d1aa8c57e7ce343e78386b03d01890d9ab03ef1ffe0487ae8917a9f190c41ef0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-py-partiql-parser \
python39-py-partiql-parser \
python3dist-py-partiql-parser"

RDEPENDS:${PN} += "python-abi"

inherit rpm

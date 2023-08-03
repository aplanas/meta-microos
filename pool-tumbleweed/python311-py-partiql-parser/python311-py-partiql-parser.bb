SUMMARY = "Pure Python PartiQL Parser"
DESCRIPTION = "Pure Python PartiQL Parser"
LICENSE = "MIT"

PV = "0.3.5"

RPM_NAME = "python311-py-partiql-parser-0.3.5-1.1.noarch.rpm"
RPM_HASH = "e8099a61e1a7a7ce5434c81ca37a9bfd858a884e686201d94cfdb00c505848d71d2aa3cbf85c59f958538755bb8fdb12bcacacfb77db186f68b883d65c6763f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-py-partiql-parser \
python3.11dist-py-partiql-parser \
python311-py-partiql-parser \
python3dist-py-partiql-parser"

RDEPENDS:${PN} += "python-abi"

inherit rpm

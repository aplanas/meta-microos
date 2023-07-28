SUMMARY = "Pure Python PartiQL Parser"
DESCRIPTION = "Pure Python PartiQL Parser"
LICENSE = "MIT"

PV = "0.3.4"

RPM_NAME = "python310-py-partiql-parser-0.3.4-1.1.noarch.rpm"
RPM_HASH = "2b2ddda83876f2377df1cc11dc4722f8204c550ee154f8165904a71bd81066ac0f126018ab7c5195649b1c35f68940da82f89f63836af8166a7a05841c2332e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-py-partiql-parser \
python310-py-partiql-parser \
python3dist-py-partiql-parser"

RDEPENDS:${PN} += "python-abi"

inherit rpm

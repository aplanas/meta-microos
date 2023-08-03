SUMMARY = "Pure Python PartiQL Parser"
DESCRIPTION = "Pure Python PartiQL Parser"
LICENSE = "MIT"

PV = "0.3.5"

RPM_NAME = "python310-py-partiql-parser-0.3.5-1.1.noarch.rpm"
RPM_HASH = "c026f85b2e312337c184c11b358759c1db5f69b105d9da410d55754c4e2c4097254fef7218c489c270e0bc7e544e4df6ae8c488ead4f9209e6ddf04cfe04c3fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-py-partiql-parser \
python310-py-partiql-parser \
python3dist-py-partiql-parser"

RDEPENDS:${PN} += "python-abi"

inherit rpm

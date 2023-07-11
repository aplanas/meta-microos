SUMMARY = "GEDCOM tools for Python"
DESCRIPTION = "GEDCOM tools for Python."
LICENSE = "MIT"

PV = "0.1.12"

RPM_NAME = "python311-ged4py-0.1.12-1.16.noarch.rpm"
RPM_HASH = "d06021f54f83e441d3ee36c5a997e1ec1df391957160cee8c995d8c23977c2fc986505217eb94071b062f2e67bd23f57947f7ed4a0f68a5bdc3749ea9fc18848"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ged4py \
python3.11dist-ged4py \
python311-ged4py \
python3dist-ged4py"

RDEPENDS:${PN} += "python-abi \
python311-ansel"

inherit rpm

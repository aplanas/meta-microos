SUMMARY = "Common files for the DMTF Cloud Audit (CADF) data model"
DESCRIPTION = "Configuration files for the DMTF Cloud Audit (CADF) data model."
LICENSE = "Apache-2.0"

PV = "3.1.1"

RPM_NAME = "python-pycadf-common-3.1.1-2.6.noarch.rpm"
RPM_HASH = "94d2493a5f319c09c7fbc8a52391133b3fd54d2ac4872e3209cca6446b7858851688a45d96e80f16e7f37a1a69a8d6f26408cdc64cb0aaadc6768599ecd980ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-python-pycadf-common \
python-pycadf-common"

RDEPENDS:${PN} += ""

inherit rpm

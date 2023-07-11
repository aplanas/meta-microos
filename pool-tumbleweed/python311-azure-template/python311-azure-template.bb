SUMMARY = "Microsoft Azure Template Package Client Library for Python"
DESCRIPTION = "This template package matches necessary patterns that the development team has established to \
create a unified sdk functional from Python 2.7 onwards. The packages contained herein can be \
installed singly or as part of the azure namespace. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8"
LICENSE = "MIT"

PV = "0.1.0b2840062"

RPM_NAME = "python311-azure-template-0.1.0b2840062-1.1.noarch.rpm"
RPM_HASH = "8d8252eac8ccd76473ecdff0e1358473446cebc36a034a3f199dcf7ae12cb9b8cc8900330d8777ca085d6be489ae5a8010b1aeac7f94786b7349bcf30aab28be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-template \
python3.11dist-azure-template \
python311-azure-template \
python3dist-azure-template"

RDEPENDS:${PN} += "python-abi \
python311-azure-core"

inherit rpm

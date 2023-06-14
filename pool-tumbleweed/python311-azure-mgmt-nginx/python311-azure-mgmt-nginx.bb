SUMMARY = "Microsoft Azure Nginx Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Nginx Management Client Library. \
 \
This package has been tested with Python 2.7, 3.6+."
LICENSE = "MIT"

PV = "2.1.0"

RPM_NAME = "python311-azure-mgmt-nginx-2.1.0-1.2.noarch.rpm"
RPM_HASH = "eb61a01fb81086694744f17de9f90c22153a8ef93f980ec6459bfaf4408e352ef90fc31de0f85cd473a19fde9b0338fec39ac5356451526d816e2cc446b29818"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-azure-mgmt-nginx \
python311-azure-mgmt-nginx \
python3dist-azure-mgmt-nginx"

RDEPENDS:${PN} += "-python311-typing-extensions >= 4.0.1 if python311-base < 3.8 \
python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm

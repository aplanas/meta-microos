SUMMARY = "Microsoft Azure Nginx Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Nginx Management Client Library. \
 \
This package has been tested with Python 2.7, 3.6+."
LICENSE = "MIT"

PV = "2.1.0"

RPM_NAME = "python39-azure-mgmt-nginx-2.1.0-1.2.noarch.rpm"
RPM_HASH = "979ad4a7f2ce0ce11b854fd9c193a0745f89e6ccc5e093bc53b3695577d8ae26c5d6ed213c5a751795172726d0c441aac547ae982ce3a6259cf38412f3024ce9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-mgmt-nginx) \
python39-azure-mgmt-nginx \
python3dist(azure-mgmt-nginx)"
RDEPENDS:${PN} += "(python39-typing_extensions >= 4.0.1 if python39-base < 3.8) \
python(abi) \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm

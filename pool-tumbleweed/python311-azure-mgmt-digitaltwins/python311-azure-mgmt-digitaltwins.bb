SUMMARY = "Microsoft Azure DigitalTwins Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Digitaltwins Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "6.4.0"

RPM_NAME = "python311-azure-mgmt-digitaltwins-6.4.0-1.2.noarch.rpm"
RPM_HASH = "2195a89d7c7c3a234f11932f70670bf38a1b05d6286fd3e35c2440f1c7d209cb313e0c196fb80bdabb49bf7c9cc2b75702840e42e23b402e011098e8a6b61506"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-mgmt-digitaltwins) \
python311-azure-mgmt-digitaltwins \
python3dist(azure-mgmt-digitaltwins)"
RDEPENDS:${PN} += "(python311-typing_extensions >= 4.3.0 if python311-base < 3.8) \
python(abi) \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm

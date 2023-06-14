SUMMARY = "Microsoft Azure Quota Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Quota Management Client Library. \
 \
This package has been tested with Python 2.7, 3.6+."
LICENSE = "MIT"

PV = "1.1.0~b3"

RPM_NAME = "python39-azure-mgmt-quota-1.1.0~b3-1.3.noarch.rpm"
RPM_HASH = "425a6779aa5edc494bf4a3568ef284038b1c5f7faf5b0300c77c40f9a38b7311a57453d0fd5f2842d5b902ff2d08e5f89adbb61bf57a2b78b42da0e96299dda0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-quota \
python39-azure-mgmt-quota \
python3dist-azure-mgmt-quota"

RDEPENDS:${PN} += "-python39-typing-extensions >= 4.3.0 if python39-base < 3.8 \
python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm

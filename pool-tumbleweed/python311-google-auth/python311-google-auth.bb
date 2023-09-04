SUMMARY = "Google Authentication Library"
DESCRIPTION = "This library simplifies using Google’s various server-to-server authentication mechanisms to access Google APIs."
LICENSE = "Apache-2.0"

PV = "2.22.0"

RPM_NAME = "python311-google-auth-2.22.0-1.1.noarch.rpm"
RPM_HASH = "83967e6127021690bd15cfd352886a06861bf6a67c8de018a3b9356b781658238f20c03d088d3f59417f037464766c3ceb7a5b171ef3c37bff7e963b1f5c5dff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-google-auth \
python3.11dist-google-auth \
python311-google-auth \
python3dist-google-auth"

RDEPENDS:${PN} += "python-abi \
python311-cachetools \
python311-cryptography \
python311-pyasn1-modules \
python311-rsa \
python311-setuptools \
python311-six"

inherit rpm

SUMMARY = "Google Authentication Library"
DESCRIPTION = "This library simplifies using Google’s various server-to-server authentication mechanisms to access Google APIs."
LICENSE = "Apache-2.0"

PV = "2.21.0"

RPM_NAME = "python310-google-auth-2.21.0-1.1.noarch.rpm"
RPM_HASH = "926060737111d57d5c9305c9b78d99b8de090c0acee52198543dcc3c6cdd401ed99b945804bcf7b154c197cd25e9780bbf6000c2b1f9dc8740cfb2a5da70ef4e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-google-auth \
python310-google-auth \
python3dist-google-auth"

RDEPENDS:${PN} += "python-abi \
python310-cachetools \
python310-cryptography \
python310-pyasn1-modules \
python310-rsa \
python310-setuptools \
python310-six"

inherit rpm

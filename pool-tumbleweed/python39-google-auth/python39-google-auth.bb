SUMMARY = "Google Authentication Library"
DESCRIPTION = "This library simplifies using Google’s various server-to-server authentication mechanisms to access Google APIs."
LICENSE = "Apache-2.0"

PV = "2.22.0"

RPM_NAME = "python39-google-auth-2.22.0-1.1.noarch.rpm"
RPM_HASH = "05d8b3f16267563e8f2a6bee59eb7c58aa4d0084b5bba0da11906c7ac5b4931cae5a1c449be8d0898feec85f163dd792aa2843fab37180cec63aee1d3042e48e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-google-auth \
python39-google-auth \
python3dist-google-auth"

RDEPENDS:${PN} += "python-abi \
python39-cachetools \
python39-cryptography \
python39-pyasn1-modules \
python39-rsa \
python39-setuptools \
python39-six"

inherit rpm

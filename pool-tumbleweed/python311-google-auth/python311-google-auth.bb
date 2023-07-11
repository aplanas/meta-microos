SUMMARY = "Google Authentication Library"
DESCRIPTION = "This library simplifies using Google’s various server-to-server authentication mechanisms to access Google APIs."
LICENSE = "Apache-2.0"

PV = "2.21.0"

RPM_NAME = "python311-google-auth-2.21.0-1.1.noarch.rpm"
RPM_HASH = "3bac96c8292ba702fed07bc79f4e2078f8813c5d94fdbc098b3e8633baebad1a90de773f437e4166f1b59d111845b75841f113a99c7b6fdb02081cc5077197c5"
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

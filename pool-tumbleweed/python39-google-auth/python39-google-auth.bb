SUMMARY = "Google Authentication Library"
DESCRIPTION = "This library simplifies using Google’s various server-to-server authentication mechanisms to access Google APIs."
LICENSE = "Apache-2.0"

PV = "2.17.3"

RPM_NAME = "python39-google-auth-2.17.3-2.1.noarch.rpm"
RPM_HASH = "74cac05780c34ef634302a99562155842ee217ad5c5c948175b24bf7df87a0ca7727c8cef3061312645b975f3bce18bc5507cc8c05fccebca2e32a885c3e7146"
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

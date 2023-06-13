SUMMARY = "Google Authentication Library"
DESCRIPTION = "This library simplifies using Google’s various server-to-server authentication mechanisms to access Google APIs."
LICENSE = "Apache-2.0"

PV = "2.17.3"

RPM_NAME = "python311-google-auth-2.17.3-2.1.noarch.rpm"
RPM_HASH = "c32ebba830f1c75616832b517abc48c4ed2436e7a2f92e3ffa7fec88a3a15c382769a4e052facb2026824f55a5b5d7701dc3f839f647b99146e56beefe8c816b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(google-auth) \
python311-google-auth \
python3dist(google-auth)"

RDEPENDS:${PN} += "python(abi) \
python311-cachetools \
python311-cryptography \
python311-pyasn1-modules \
python311-rsa \
python311-setuptools \
python311-six"

inherit rpm

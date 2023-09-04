SUMMARY = "Google Authentication Library"
DESCRIPTION = "This library simplifies using Google’s various server-to-server authentication mechanisms to access Google APIs."
LICENSE = "Apache-2.0"

PV = "2.22.0"

RPM_NAME = "python310-google-auth-2.22.0-1.1.noarch.rpm"
RPM_HASH = "c8a10ab0da758ccfe7c5fbb21a60bc0c2d9cf1d00125a38f5a0f986a2dab6518c090f4e30de47bf1e5c52bbe568b1f5828596e45a3fd31263f773563e2d08667"
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

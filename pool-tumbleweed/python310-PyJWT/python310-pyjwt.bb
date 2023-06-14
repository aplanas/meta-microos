SUMMARY = "JSON Web Token implementation in Python"
DESCRIPTION = "A Python implementation of JSON Web Token draft 01."
LICENSE = "MIT"

PV = "2.7.0"

RPM_NAME = "python310-PyJWT-2.7.0-1.1.noarch.rpm"
RPM_HASH = "e889adf3a4ac7fb239f61cd8b467c5e171800d832edc6f513274c3b0f01af78c51e9b75d8bf7381a52dd529950050b6db474939ee4c3364a342b384ddc3c4ae1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-PyJWT \
python3.10dist-pyjwt \
python310-PyJWT \
python3dist-pyjwt"

RDEPENDS:${PN} += "python-abi \
python310-cryptography \
python310-typing-extensions \
update-alternatives"

inherit rpm

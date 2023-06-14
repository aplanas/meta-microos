SUMMARY = "Python module for calculating a token to run the Google text-to-speech engine"
DESCRIPTION = "gTTS-token (Google Text to Speech token) is a Python implementation \
of the token validation required by Google Translate when making \
a request to its API."
LICENSE = "MIT"

PV = "1.1.4"

RPM_NAME = "python310-gTTS-token-1.1.4-1.3.noarch.rpm"
RPM_HASH = "cf78c8d44ac08e5920510d48eaf3e2ce609d2edb673f0b4d17b17cc9d75d34d4b205e6430cef39c76498363c0e181401c87859dd762feeff13bc1056fa7ca356"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-gTTS-token \
python3.10dist-gtts-token \
python310-gTTS-token \
python3dist-gtts-token"

RDEPENDS:${PN} += "python-abi \
python310-requests"

inherit rpm

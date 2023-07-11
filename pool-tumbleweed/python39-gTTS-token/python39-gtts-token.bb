SUMMARY = "Python module for calculating a token to run the Google text-to-speech engine"
DESCRIPTION = "gTTS-token (Google Text to Speech token) is a Python implementation \
of the token validation required by Google Translate when making \
a request to its API."
LICENSE = "MIT"

PV = "1.1.4"

RPM_NAME = "python39-gTTS-token-1.1.4-1.4.noarch.rpm"
RPM_HASH = "77039f66102f8161d767ab0afd27b04f5667037886c4695bd70cef0079e240d73f94b20b63fe4eed9c26edb77a856f3bb3797569c2e59c3817ae282ccb73b767"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-gtts-token \
python39-gTTS-token \
python3dist-gtts-token"

RDEPENDS:${PN} += "python-abi \
python39-requests"

inherit rpm

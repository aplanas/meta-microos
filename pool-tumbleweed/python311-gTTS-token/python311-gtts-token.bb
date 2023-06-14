SUMMARY = "Python module for calculating a token to run the Google text-to-speech engine"
DESCRIPTION = "gTTS-token (Google Text to Speech token) is a Python implementation \
of the token validation required by Google Translate when making \
a request to its API."
LICENSE = "MIT"

PV = "1.1.4"

RPM_NAME = "python311-gTTS-token-1.1.4-1.3.noarch.rpm"
RPM_HASH = "3e126e7d5186eb8949014888184c36b0ac017ae96c63d2b593970734c7b2c382447143eb5f4ac494c9a3ce9e1e16311f6fd6ea07af6518e9d27799acd0ba8ef3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-gtts-token \
python311-gTTS-token \
python3dist-gtts-token"

RDEPENDS:${PN} += "python-abi \
python311-requests"

inherit rpm

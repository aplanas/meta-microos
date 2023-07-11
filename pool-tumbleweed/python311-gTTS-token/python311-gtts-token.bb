SUMMARY = "Python module for calculating a token to run the Google text-to-speech engine"
DESCRIPTION = "gTTS-token (Google Text to Speech token) is a Python implementation \
of the token validation required by Google Translate when making \
a request to its API."
LICENSE = "MIT"

PV = "1.1.4"

RPM_NAME = "python311-gTTS-token-1.1.4-1.4.noarch.rpm"
RPM_HASH = "6c7e6ee6de926e92c38c7e6f9f798ad06b9e44d63579688508d86659d8c136fb85ea8cb6dada62120a2a15c04debdce83f0225341461b85c5eb6b36a24f09e0b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-gTTS-token \
python3.11dist-gtts-token \
python311-gTTS-token \
python3dist-gtts-token"

RDEPENDS:${PN} += "python-abi \
python311-requests"

inherit rpm

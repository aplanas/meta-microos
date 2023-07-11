SUMMARY = "Python module for calculating a token to run the Google text-to-speech engine"
DESCRIPTION = "gTTS-token (Google Text to Speech token) is a Python implementation \
of the token validation required by Google Translate when making \
a request to its API."
LICENSE = "MIT"

PV = "1.1.4"

RPM_NAME = "python310-gTTS-token-1.1.4-1.4.noarch.rpm"
RPM_HASH = "a8bd19d65d85da789a8443dec79a9c7766b45e67c81b9b778891d71cc6c069f09a407111034faa63fc96c94fa088b265797b30b1bc02961b2d1697e3d77b795b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-gtts-token \
python310-gTTS-token \
python3dist-gtts-token"

RDEPENDS:${PN} += "python-abi \
python310-requests"

inherit rpm

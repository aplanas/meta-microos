SUMMARY = "Client for the Spotify Web API"
DESCRIPTION = "Spotipy is a Python library for the Spotify Web API. \
With Spotipy, the user gets access to the music data \
provided by the Spotify platform. \
 \
Documentation is available at \
https://spotipy.readthedocs.io/"
LICENSE = "MIT"

PV = "2.22.0"

RPM_NAME = "python310-spotipy-2.22.0-1.5.noarch.rpm"
RPM_HASH = "a57925ecdaf6ed05fdfe66386389c66ae1f11b1024fa01d8602416afcce7f1ebd1d3d8e667a5afeeb547a2ac5e8eb6428895c25aa1570761f68358c5df7d1482"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-spotipy \
python310-spotipy \
python3dist-spotipy"

RDEPENDS:${PN} += "python-abi \
python310-redis \
python310-requests \
python310-six \
python310-urllib3"

inherit rpm

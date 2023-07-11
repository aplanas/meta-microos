SUMMARY = "Client for the Spotify Web API"
DESCRIPTION = "Spotipy is a Python library for the Spotify Web API. \
With Spotipy, the user gets access to the music data \
provided by the Spotify platform. \
 \
Documentation is available at \
https://spotipy.readthedocs.io/"
LICENSE = "MIT"

PV = "2.22.0"

RPM_NAME = "python39-spotipy-2.22.0-1.5.noarch.rpm"
RPM_HASH = "29454a3804b76fa35e59ddeac3063b11e5d55a201ff2132a7a68dbab1274344f016b05fdeaff74a5d3a39ca4a929d884dab2edbaec99880d69366e7ff8b961c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-spotipy \
python39-spotipy \
python3dist-spotipy"

RDEPENDS:${PN} += "python-abi \
python39-redis \
python39-requests \
python39-six \
python39-urllib3"

inherit rpm

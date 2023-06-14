SUMMARY = "Client for the Spotify Web API"
DESCRIPTION = "Spotipy is a Python library for the Spotify Web API. \
With Spotipy, the user gets access to the music data \
provided by the Spotify platform. \
 \
Documentation is available at \
https://spotipy.readthedocs.io/"
LICENSE = "MIT"

PV = "2.22.0"

RPM_NAME = "python39-spotipy-2.22.0-1.3.noarch.rpm"
RPM_HASH = "f19a86b6d65df8beda712e90edcd72f63dad486200b1863f0f4dae10c2f484c4f860dff9dd794a10a7eb174f8496fa7c2155c9a0d58a3f9bf3c3b47fb6069f9c"
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

SUMMARY = "Client for the Spotify Web API"
DESCRIPTION = "Spotipy is a Python library for the Spotify Web API. \
With Spotipy, the user gets access to the music data \
provided by the Spotify platform. \
 \
Documentation is available at \
https://spotipy.readthedocs.io/"
LICENSE = "MIT"

PV = "2.22.0"

RPM_NAME = "python311-spotipy-2.22.0-1.5.noarch.rpm"
RPM_HASH = "cd27c31151446a01a8eb46d24f233132781cf3f9e718191f0fe1ab984ce47d3e2adb0d50d94e1bf3ea4f3937d45dee91386ca23b24266c55a8db7b3d1517f515"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-spotipy \
python3.11dist-spotipy \
python311-spotipy \
python3dist-spotipy"

RDEPENDS:${PN} += "python-abi \
python311-redis \
python311-requests \
python311-six \
python311-urllib3"

inherit rpm

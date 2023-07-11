SUMMARY = "A Python MPD client library"
DESCRIPTION = "The python-mpd2 package is a Python library which provides \
a client interface for the Music Player Daemon. \
 \
python-mpd2 is a fork of python-mpd.  While 0.4.x was backwards compatible \
with python-mpd, starting with 0.5 provides enhanced features which are *NOT* \
backward compatibles with the original python-mpd package."
LICENSE = "LGPL-3.0-only"

PV = "3.0.5"

RPM_NAME = "python39-python-mpd2-3.0.5-1.7.noarch.rpm"
RPM_HASH = "191dc4d8c336cf88c6760ec3f6531a2fc172e2f9ba74157a87d7b675277ac2691e872e9db6cc70c15ac87fe05b8199cc4c116285838519662d8b98729488fe72"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-python-mpd2 \
python39-python-mpd2 \
python3dist-python-mpd2"

RDEPENDS:${PN} += "python-abi"

inherit rpm

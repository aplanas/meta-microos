SUMMARY = "A Python MPD client library"
DESCRIPTION = "The python-mpd2 package is a Python library which provides \
a client interface for the Music Player Daemon. \
 \
python-mpd2 is a fork of python-mpd.  While 0.4.x was backwards compatible \
with python-mpd, starting with 0.5 provides enhanced features which are *NOT* \
backward compatibles with the original python-mpd package."
LICENSE = "LGPL-3.0-only"

PV = "3.0.5"

RPM_NAME = "python310-python-mpd2-3.0.5-1.7.noarch.rpm"
RPM_HASH = "d3aefa7782350482bb96a64c9e1658dc51a063cd870f272664c99ad821247e18bb671d6276e2a2b244cc29836facffb00234a532e44fea721c3b4b32427c4071"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-python-mpd2 \
python310-python-mpd2 \
python3dist-python-mpd2"

RDEPENDS:${PN} += "python-abi"

inherit rpm

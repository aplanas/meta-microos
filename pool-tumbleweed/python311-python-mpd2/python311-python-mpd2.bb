SUMMARY = "A Python MPD client library"
DESCRIPTION = "The python-mpd2 package is a Python library which provides \
a client interface for the Music Player Daemon. \
 \
python-mpd2 is a fork of python-mpd.  While 0.4.x was backwards compatible \
with python-mpd, starting with 0.5 provides enhanced features which are *NOT* \
backward compatibles with the original python-mpd package."
LICENSE = "LGPL-3.0-only"

PV = "3.0.5"

RPM_NAME = "python311-python-mpd2-3.0.5-1.5.noarch.rpm"
RPM_HASH = "0f89f9ce4c40bc16f37bc7ce4aef358ec1a3a6725cb74579795140bc530325fb219b3163041fc51a1fec255a7f40bbed19ecd0f44b33f0b1c3b90014067ba77e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(python-mpd2) \
python311-python-mpd2 \
python3dist(python-mpd2)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm

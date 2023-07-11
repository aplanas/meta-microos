SUMMARY = "A Python MPD client library"
DESCRIPTION = "The python-mpd2 package is a Python library which provides \
a client interface for the Music Player Daemon. \
 \
python-mpd2 is a fork of python-mpd.  While 0.4.x was backwards compatible \
with python-mpd, starting with 0.5 provides enhanced features which are *NOT* \
backward compatibles with the original python-mpd package."
LICENSE = "LGPL-3.0-only"

PV = "3.0.5"

RPM_NAME = "python311-python-mpd2-3.0.5-1.7.noarch.rpm"
RPM_HASH = "3eab6af4e1dbbf6b7d927ee3ba0532fc7ab2040fa6995c347d8d0b7f7247330cb34f7048adbcdcfa8ce3f5f4203d2b6668517d819dfb34a3bc7d0bfc723dc3c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-mpd2 \
python3.11dist-python-mpd2 \
python311-python-mpd2 \
python3dist-python-mpd2"

RDEPENDS:${PN} += "python-abi"

inherit rpm

SUMMARY = "Curses based internet radio player"
DESCRIPTION = "A command line Internet radio player based on curses, that uses external media \
players to perform the actual playback. It currently supports the following \
players: MPV, MPlayer and VLC."
LICENSE = "MIT"

PV = "0.9.2.11"

RPM_NAME = "pyradio-0.9.2.11-2.1.noarch.rpm"
RPM_HASH = "e6f1bea7277486094c37b76128aff8d5d199430a9b8c7d05d2e5e9ec26e6b0f0bd32085634d35c0e55bee0686ea04aa29fcd98ded5766231543da709958defaa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pyradio \
python3.11dist-pyradio \
python3dist-pyradio"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
python3-rich"

inherit rpm

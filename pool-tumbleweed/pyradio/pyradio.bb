SUMMARY = "Curses based internet radio player"
DESCRIPTION = "A command line Internet radio player based on curses, that uses external media \
players to perform the actual playback. It currently supports the following \
players: MPV, MPlayer and VLC."
LICENSE = "MIT"

PV = "0.9.2.13"

RPM_NAME = "pyradio-0.9.2.13-1.1.noarch.rpm"
RPM_HASH = "9afdc6155d2ae38da7a06428369de3e56c8d45d45e40a8bf4c0a15cd062604244de53247c1088dffce2a7a27937435152fff8d23cf5f05a65a1d53b76456ea98"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pyradio \
python3.11dist-pyradio \
python3dist-pyradio"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
python3-rich"

inherit rpm

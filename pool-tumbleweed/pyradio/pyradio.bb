SUMMARY = "Curses based internet radio player"
DESCRIPTION = "A command line Internet radio player based on curses, that uses external media \
players to perform the actual playback. It currently supports the following \
players: MPV, MPlayer and VLC."
LICENSE = "MIT"

PV = "0.9.2.11"

RPM_NAME = "pyradio-0.9.2.11-1.1.noarch.rpm"
RPM_HASH = "3599aafc7c33111ac01c74b67d0af48dedc4100a4aa71ffc0c854d1d2f3598b81a16746b902082de50074b2b56c72cbfad0135a5aa05e930ea2b14497b8160a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pyradio \
python3.11dist-pyradio \
python3dist-pyradio"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi"

inherit rpm

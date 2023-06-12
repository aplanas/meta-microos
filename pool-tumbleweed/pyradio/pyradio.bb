SUMMARY = "Curses based internet radio player"
DESCRIPTION = "A command line Internet radio player based on curses, that uses external media \
players to perform the actual playback. It currently supports the following \
players: MPV, MPlayer and VLC."
LICENSE = "MIT"

PV = "0.8.9.9"

RPM_NAME = "pyradio-0.8.9.9-1.8.noarch.rpm"
RPM_HASH = "216d5562ae9a9cc93ba95da5323ecc86f225a461b3a31febf3bd65e0f9b29273a104d8d59a7933c6e74a596fbbc3fc7b80c1734f8df56eb965c5f593a654c1c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pyradio \
python3.10dist(pyradio) \
python3dist(pyradio)"
RDEPENDS:${PN} += "/usr/bin/python3 \
python(abi)"

inherit rpm

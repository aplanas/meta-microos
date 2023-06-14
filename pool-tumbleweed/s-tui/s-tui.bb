SUMMARY = "Terminal based CPU stress and monitoring utility"
DESCRIPTION = "Terminal UI for monitoring your computer to monitor CPU temperature, frequency, \
power and utilization in a graphical way from the terminal."
LICENSE = "GPL-2.0-or-later"

PV = "1.1.4"

RPM_NAME = "s-tui-1.1.4-1.2.noarch.rpm"
RPM_HASH = "47434665321573130ddc8f6ed04cc82cc75e15baf89490492a62810b9b64708c0aaea0f0b1448777c7fec074bc75b453da2463175b6b18454ad7e27beab0cbf8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-s-tui \
python3dist-s-tui \
s-tui"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
python3-psutil \
python3-urwid"

inherit rpm

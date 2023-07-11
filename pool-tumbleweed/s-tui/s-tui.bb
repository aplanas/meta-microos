SUMMARY = "Terminal based CPU stress and monitoring utility"
DESCRIPTION = "Terminal UI for monitoring your computer to monitor CPU temperature, frequency, \
power and utilization in a graphical way from the terminal."
LICENSE = "GPL-2.0-or-later"

PV = "1.1.4"

RPM_NAME = "s-tui-1.1.4-1.3.noarch.rpm"
RPM_HASH = "f56d10777ade1d6d9c85cb67e9629266b3baad69ce11ff9e69303aecd1eba98ef615d724519a8c3350eb3faa5e7b5af32528f36c2030244a7f3cee0535f40317"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-s-tui \
python3dist-s-tui \
s-tui"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
python3-psutil \
python3-urwid"

inherit rpm

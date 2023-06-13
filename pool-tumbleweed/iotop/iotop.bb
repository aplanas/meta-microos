SUMMARY = "Top Like UI to Show Per-Process I/O Going on"
DESCRIPTION = "Linux has always been able to show how much I/O was going on (the bi \
and bo columns of the vmstat 1 command). \
 \
Iotop is a Python program with a UI similar to top to show on behalf of \
which process is the I/O going on."
LICENSE = "GPL-2.0-only"

PV = "0.6git.20220308"

RPM_NAME = "iotop-0.6git.20220308-1.2.aarch64.rpm"
RPM_HASH = "c15068eee430fde5a2b67d64e8d07e81c494f96f6d13fbdb69622e3957017a55ad6f60cbf6b2eb067903f1dcf3c8dde70cd452d3a06fd095eb211f547ff7bc39"

RPROVIDES:${PN} += "iotop \
iotop(aarch-64) \
python3.10dist(iotop) \
python3dist(iotop)"

RDEPENDS:${PN} += "/usr/bin/python3 \
python(abi) \
python3-curses"

inherit rpm

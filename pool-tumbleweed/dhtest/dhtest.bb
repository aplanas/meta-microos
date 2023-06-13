SUMMARY = "A DHCP client simulation tool"
DESCRIPTION = "dhtest - linux DHCP client simulation tool. It can simulate hundreds of DHCP \
client from a linux machine. Linux root login is needed because the tool \
requires layer2 raw socket for sending and receiving DHCP packets."
LICENSE = "GPL-2.0-or-later"

PV = "1.5"

RPM_NAME = "dhtest-1.5-2.12.aarch64.rpm"
RPM_HASH = "9464689079fc8ba7a37d24b0151e35aa096ec114efba3fe411a34f234bb538bdae53f16bf23c163af209fd9d3d3a743929fe19c66649fe67f0f6133e389cfeec"

RPROVIDES:${PN} += "dhtest \
dhtest(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit)"

inherit rpm

SUMMARY = "'top' for Squid proxy process"
DESCRIPTION = "Console applicaton to display information about currently active client connections for a Squid proxy in a convenient way."
LICENSE = "GPL-2.0+"

PV = "2015.02.08"

RPM_NAME = "sqtop-2015.02.08-1.21.aarch64.rpm"
RPM_HASH = "35054dc334a535ac466c8318fb76ae557d06a0e1f42a30e004c883f28b238f30f648780c750915083e5f7f915f97aee255454a47d25e1ab18b05e29cbda0b306"

RPROVIDES:${PN} += "sqtop \
sqtop(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libncurses.so.6()(64bit) \
libstdc++.so.6()(64bit) \
libtinfo.so.6()(64bit)"

inherit rpm

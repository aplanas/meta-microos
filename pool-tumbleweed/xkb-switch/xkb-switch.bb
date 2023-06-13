SUMMARY = "Switch X keyboard layouts from the command line"
DESCRIPTION = "xkb-switch is a C++ program that allows to query and change the XKB layout state."
LICENSE = "GPL-3.0-only"

PV = "1.8.5"

RPM_NAME = "xkb-switch-1.8.5-1.8.aarch64.rpm"
RPM_HASH = "d1f427e6c8521f6cda5cbdf2157b6c799fc11d8d79fef72ef0abcfe058b721f82333b18d644956984538d5ab72790e14a566cacdb8e4ee89ed306ebfa89b24de"

RPROVIDES:${PN} += "libxkbswitch.so.1()(64bit) \
xkb-switch \
xkb-switch(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libX11.so.6()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit) \
libxkbfile.so.1()(64bit)"

inherit rpm

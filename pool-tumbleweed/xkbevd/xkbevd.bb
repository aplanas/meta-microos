SUMMARY = "XKB event daemon"
DESCRIPTION = "The xkbevd event daemon listens for specified XKB events and executes \
requested commands if they occur. The configuration file consists of \
a list of event specification/action pairs and/or variable definitions."
LICENSE = "MIT"

PV = "1.1.5"

RPM_NAME = "xkbevd-1.1.5-1.2.aarch64.rpm"
RPM_HASH = "bd6f467862f35dc2e57879afaf6600f855a5d8290e6c294912f1054f9686b081b2a5708f39588cbdba50d817285959a3f5545a6ae5f2b6aaad5a9eaf2f75f096"

RPROVIDES:${PN} += "xkbevd \
xkbevd(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11.so.6()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libxkbfile.so.1()(64bit)"

inherit rpm

SUMMARY = "Commandline utilities for access to MTP Players"
DESCRIPTION = "This package contains binaries that allow command line access to USB \
based media players based on the MTP (Media Transfer Protocol) authored \
by Microsoft. For graphical user interfaces use Amarok or Banshee."
LICENSE = "LGPL-2.1-or-later"

PV = "1.1.21"

RPM_NAME = "mtp-tools-1.1.21-1.1.aarch64.rpm"
RPM_HASH = "88ca7e8e26045d6806a252cec59fb77bdeb5f6fffb9922ae48fbe8d13bea7585f609bb0d5debf9324f2b26122ed58262347f21c429fbd299e50d674375fc022b"

RPROVIDES:${PN} += "mtp-tools \
mtp-tools(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libmtp.so.9()(64bit)"

inherit rpm

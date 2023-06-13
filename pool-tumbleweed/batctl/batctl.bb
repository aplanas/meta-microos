SUMMARY = "B.A.T.M.A.N. advanced control and management tool"
DESCRIPTION = "Why do I need batctl?  B.A.T.M.A.N. advanced operates on layer 2 and \
thus all hosts participating in the virtual switch are completely \
transparent for all protocols above layer 2.  Therefore the common \
diagnosis tools do not work as expected.  To overcome these problems \
batctl was created.  At the moment batctl contains ping, traceroute, \
tcpdump and interfaces to the kernel module settings."
LICENSE = "GPL-2.0-only & MIT"

PV = "2023.0"

RPM_NAME = "batctl-2023.0-1.3.aarch64.rpm"
RPM_HASH = "4058dac627413d28b8129309dc5031cfe16d28027b18cf2f35860bf9258183159084a889a51166b2dd3f721b2f06c0015b4ddc1bf76f3fd4d73547bf89dc627d"

RPROVIDES:${PN} += "batctl \
batctl(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libnl-3.so.200()(64bit) \
libnl-3.so.200(libnl_3)(64bit) \
libnl-genl-3.so.200()(64bit) \
libnl-genl-3.so.200(libnl_3)(64bit)"

inherit rpm

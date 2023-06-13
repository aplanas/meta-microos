SUMMARY = "X Display Manager Control Protocol library"
DESCRIPTION = "The X Display Manager Control Protocol (XDMCP) provides a uniform \
mechanism for an autonomous display to request login service from a \
remote host. By autonomous, we mean the display consists of hardware \
and processes that are independent of any particular host where login \
service is desired. An X terminal (screen, keyboard, mouse, \
processor, network interface) is a prime example of an autonomous \
display."
LICENSE = "MIT"

PV = "1.1.4"

RPM_NAME = "libXdmcp6-1.1.4-1.2.aarch64.rpm"
RPM_HASH = "9772abc20b716af1ee44964d179133126417f4257feeee97e882e8f4ffc651b01240f2798dc162ca13208e2b265e578ce03f991971bb9d4f090b7e94b56deaad"

RPROVIDES:${PN} += "libXdmcp.so.6()(64bit) \
libXdmcp6 \
libXdmcp6(aarch-64) \
xorg-x11-libXdmcp"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit)"

inherit rpm

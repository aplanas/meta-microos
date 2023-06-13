SUMMARY = "Distributed Multihead X extension library"
DESCRIPTION = "libdmx is an interface to the DMX extension for X, which allows a \
single server to be set up as a proxy spanning multiple servers -- \
not unlike Xinerama across discrete physical machines. It can be \
reconfigured on the fly to change the layout, and it is presented as \
a single logical display to clients. \
 \
libdmx allows clients to configure the layout of DMX servers by \
adding and removing screens, input devices, et al."
LICENSE = "MIT"

PV = "1.1.4"

RPM_NAME = "libdmx1-1.1.4-1.19.aarch64.rpm"
RPM_HASH = "d91213b8e17820b76579094c940b1bc87ca7afd2436ee4fed51b93269f1a3821e0cd00152228bfec29eece44fda007d7ddfe5b17a847f49b4ff925bc7d94702b"

RPROVIDES:${PN} += "libdmx.so.1()(64bit) \
libdmx1 \
libdmx1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11.so.6()(64bit) \
libXext.so.6()(64bit) \
libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm

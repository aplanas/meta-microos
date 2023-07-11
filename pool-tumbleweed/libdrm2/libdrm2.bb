SUMMARY = "Userspace Interface for Kernel DRM Services"
DESCRIPTION = "libdrm is a library for accessing the Direct Rendering Manager on \
Linux, BSD and other operating systems that support the ioctl \
interface, and for chipsets with DRM memory manager, support for \
tracking relocations and buffers. libdrm is a low-level library, \
typically used by graphics drivers such as the Mesa DRI and X \
drivers."
LICENSE = "MIT"

PV = "2.4.115"

RPM_NAME = "libdrm2-2.4.115-2.4.aarch64.rpm"
RPM_HASH = "587d4e78f1a1316643f178b358445e61ce5c8a9676849ca38d412d29b5faf68c2ce2f69e277cca8c4653a6a8d8fdb5aae777de562e5030f60d804c8380d92eda"

RPROVIDES:${PN} += "libdrm.so.2 \
libdrm2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm

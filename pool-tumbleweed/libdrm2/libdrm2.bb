SUMMARY = "Userspace Interface for Kernel DRM Services"
DESCRIPTION = "libdrm is a library for accessing the Direct Rendering Manager on \
Linux, BSD and other operating systems that support the ioctl \
interface, and for chipsets with DRM memory manager, support for \
tracking relocations and buffers. libdrm is a low-level library, \
typically used by graphics drivers such as the Mesa DRI and X \
drivers."
LICENSE = "MIT"

PV = "2.4.116"

RPM_NAME = "libdrm2-2.4.116-1.1.aarch64.rpm"
RPM_HASH = "3dce86542fcb8c79bb67806ff22ba225b00a0a051df4c48045c28720eec7b949dd091a4930b5e5ba6827b3d154757d0ef3482e2cd29f08ba580ffdae3409eedd"

RPROVIDES:${PN} += "libdrm.so.2 \
libdrm2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm

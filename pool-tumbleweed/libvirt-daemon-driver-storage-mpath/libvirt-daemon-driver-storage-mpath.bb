SUMMARY = "Storage driver plugin for multipath volumes"
DESCRIPTION = "The storage driver backend adding implementation of the storage APIs for \
multipath storage using device mapper."
LICENSE = "LGPL-2.1-or-later"

PV = "9.4.0"

RPM_NAME = "libvirt-daemon-driver-storage-mpath-9.4.0-1.1.aarch64.rpm"
RPM_HASH = "8580c7627182a88bbe488988cd3bed4e6b2142271bad60cefda54cc537865c24a2110bd598b8eed1b6b166bc4159435bcc144174071204fbfdb442ae226295ed"

RPROVIDES:${PN} += "libvirt-daemon-driver-storage-mpath \
libvirt-daemon-driver-storage-mpath(aarch-64) \
libvirt_storage_backend_mpath.so()(64bit)"

RDEPENDS:${PN} += "device-mapper \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libdevmapper.so.1.03()(64bit) \
libdevmapper.so.1.03(Base)(64bit) \
libdevmapper.so.1.03(DM_1_02_97)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libglib-2.0.so.0()(64bit) \
libvirt-daemon-driver-storage-core \
libvirt-libs \
libvirt.so.0()(64bit) \
libvirt.so.0(LIBVIRT_PRIVATE_9.4.0)(64bit)"

inherit rpm

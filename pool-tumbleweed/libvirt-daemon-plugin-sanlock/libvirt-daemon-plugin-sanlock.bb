SUMMARY = "Sanlock lock manager plugin for QEMU driver"
DESCRIPTION = "Includes the Sanlock lock manager plugin for the QEMU driver"
LICENSE = "LGPL-2.1-or-later"

PV = "9.4.0"

RPM_NAME = "libvirt-daemon-plugin-sanlock-9.4.0-1.1.aarch64.rpm"
RPM_HASH = "4199ded9e05f5e4712d8b1c2b7911f04f3f0a6f16c5d22a81147b81a45fb3f9e03b2c775030d8f9e55701fdf070cac67da0ae39f4718df78dd72a4d408e03d1d"

RPROVIDES:${PN} += "config(libvirt-daemon-plugin-sanlock) \
libvirt-daemon-plugin-sanlock \
libvirt-daemon-plugin-sanlock(aarch-64) \
libvirt-lock-sanlock"

RDEPENDS:${PN} += "/bin/sh \
augeas \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libglib-2.0.so.0()(64bit) \
libsanlock_client.so.1()(64bit) \
libvirt-libs \
libvirt.so.0()(64bit) \
libvirt.so.0(LIBVIRT_0.0.3)(64bit) \
libvirt.so.0(LIBVIRT_0.1.1)(64bit) \
libvirt.so.0(LIBVIRT_0.4.0)(64bit) \
libvirt.so.0(LIBVIRT_0.7.3)(64bit) \
libvirt.so.0(LIBVIRT_PRIVATE_9.4.0)(64bit) \
sanlock"

inherit rpm

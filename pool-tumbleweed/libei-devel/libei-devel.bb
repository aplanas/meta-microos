SUMMARY = "Header files for libei, a library for emulated input under Wayland"
DESCRIPTION = "libei is a library for Emulated Input, targeting the Wayland stack."
LICENSE = "MIT"

PV = "0.99.2"

RPM_NAME = "libei-devel-0.99.2-1.1.aarch64.rpm"
RPM_HASH = "2863f25c5405de025b363a36873f5655e87744c281e8ebf2b60fdfab59b10aebd19f37a025b4b703a8ab5fbc8f9ca4626adc3878558c8766a7fdcfe6aa05a478"

RPROVIDES:${PN} += "libei-devel \
libei-devel(aarch-64) \
pkgconfig(libei-1.0) \
pkgconfig(libeis-1.0) \
pkgconfig(liboeffis-1.0)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libei.so.1()(64bit) \
libei1 \
libevdev.so.2()(64bit) \
libevdev.so.2(LIBEVDEV_1)(64bit) \
pkgconfig(libsystemd)"

inherit rpm

SUMMARY = "Package compiler and linker metadata toolkit"
DESCRIPTION = "pkgconf is a program which helps to configure compiler and linker flags \
for development frameworks. It is similar to pkg-config from freedesktop.org \
and handles .pc files in a similar manner as pkg-config."
LICENSE = "ISC"

PV = "1.8.0"

RPM_NAME = "pkgconf-1.8.0-2.3.aarch64.rpm"
RPM_HASH = "86e215a326f9a621fce801f7589e01488b5cedf5c1afbb5ad6605aaa3a0fbea35fabbd5317382d9c7cbf825387eee56b5539ee06ff7df16dba9ee9755e678f87"

RPROVIDES:${PN} += "pkgconf \
pkgconf(aarch-64) \
pkgconfig(pkgconf) \
rpm_macro(pkgconfig_personalitydir)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libpkgconf.so.3()(64bit) \
libpkgconf3(aarch-64)"

inherit rpm

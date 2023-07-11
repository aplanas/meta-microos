SUMMARY = "Development files for libimobiledevice"
DESCRIPTION = "The libimobiledevice-devel package contains libraries and header files for \
developing applications that use libimobiledevice."
LICENSE = "LGPL-2.1-or-later"

PV = "1.3.0+179git.20230430"

RPM_NAME = "libimobiledevice-devel-1.3.0+179git.20230430-1.2.aarch64.rpm"
RPM_HASH = "b9c5b6795d86c84f4da6e93038f75085c2793dfa15b32ff6010d676279e12aae7b7376e1fddf238f64db7acb29e7164b57adc4279243a6a9124e2606a073f73b"

RPROVIDES:${PN} += "libimobiledevice-devel \
pkgconfig-libimobiledevice-1.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libimobiledevice-1-0-6 \
pkgconfig-libimobiledevice-glue-1.0 \
pkgconfig-libplist-2.0 \
pkgconfig-libusbmuxd-2.0 \
pkgconfig-openssl"

inherit rpm

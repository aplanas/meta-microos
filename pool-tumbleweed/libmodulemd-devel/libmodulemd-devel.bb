SUMMARY = "Development files for libmodulemd"
DESCRIPTION = "This package provides files for developing applications to use libmodulemd."
LICENSE = "MIT"

PV = "2.14.0"

RPM_NAME = "libmodulemd-devel-2.14.0-1.4.aarch64.rpm"
RPM_HASH = "d24c516025bf1b5079ad315806426eb76a582672fb9652cedfb62936476439926fac028ee29be3940108770e5c7a360145d46c505b63dc516bdbbe9de9b6f96b"

RPROVIDES:${PN} += "libmodulemd-devel \
pkgconfig-modulemd-2.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmodulemd2 \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-rpm \
pkgconfig-yaml-0.1 \
typelib-1-0-Modulemd-2-0"

inherit rpm

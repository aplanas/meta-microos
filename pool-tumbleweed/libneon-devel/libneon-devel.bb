SUMMARY = "An HTTP and WebDAV Client Library"
DESCRIPTION = "neon is an HTTP and WebDAV client library with a C interface."
LICENSE = "GPL-2.0-or-later"

PV = "0.32.5"

RPM_NAME = "libneon-devel-0.32.5-1.5.aarch64.rpm"
RPM_HASH = "fc731e3135e6944e683e92025070808f98fd564bb53144665757924d2b02e42c876e1c102a7ccd8def8ae3680cbbb7caa8923ead2bcbce53f146dc425d444c2a"

RPROVIDES:${PN} += "libneon-devel \
neon-devel \
pkgconfig-neon"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
glibc-devel \
libneon27"

inherit rpm

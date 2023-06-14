SUMMARY = "Library for Handling of Gadu-Gadu Instant Messaging"
DESCRIPTION = "libgadu is a library for handling of protocol of a popular Polish \
instant messenger Gadu-Gadu."
LICENSE = "LGPL-2.1-or-later"

PV = "1.12.2"

RPM_NAME = "libgadu-devel-1.12.2-2.18.aarch64.rpm"
RPM_HASH = "551b5421daa3dde519b32b6f33877b1d8395d79b5efef21815cbf27616361874b7c977be2e43a5145f12aa62f26aeb395237a6d8521583d1e4c9392bdaeebf6f"

RPROVIDES:${PN} += "libgadu-devel \
pkgconfig-libgadu"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libgadu3 \
pkgconfig-gnutls"

inherit rpm

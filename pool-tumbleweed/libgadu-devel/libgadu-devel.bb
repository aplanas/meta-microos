SUMMARY = "Library for Handling of Gadu-Gadu Instant Messaging"
DESCRIPTION = "libgadu is a library for handling of protocol of a popular Polish \
instant messenger Gadu-Gadu."
LICENSE = "LGPL-2.1-or-later"

PV = "1.12.2"

RPM_NAME = "libgadu-devel-1.12.2-2.19.aarch64.rpm"
RPM_HASH = "917552eeb259a7636c9937bbcc7a1f780cadd7917061d6f00a941d067dc7edc2f71955a59c80398c1dfc5b4e1df67fc8721f79f6b128f10486a311e30eb45b6f"

RPROVIDES:${PN} += "libgadu-devel \
pkgconfig-libgadu"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libgadu3 \
pkgconfig-gnutls"

inherit rpm

SUMMARY = "Userspace library for the in-kernel connection tracking state table"
DESCRIPTION = "libnetfilter_conntrack is a userspace library providing a programming \
interface (API) to the in-kernel connection tracking state table. The \
library libnetfilter_conntrack has been previously known as \
libnfnetlink_conntrack and libctnetlink. This library is currently \
used by conntrack-tools among many other applications."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.9"

RPM_NAME = "libnetfilter_conntrack-devel-1.0.9-1.7.aarch64.rpm"
RPM_HASH = "5935a8b107d4f6feda0a0469051de359c278f8e29ecc3d9ec520a67dcc9b68c68b46a561fee23695ad2bcb50a0360b9fb5232cdea03add13c0b443b658ccd920"

RPROVIDES:${PN} += "libnetfilter-conntrack-devel \
pkgconfig-libnetfilter-conntrack"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libnetfilter-conntrack3 \
pkgconfig-libnfnetlink"

inherit rpm

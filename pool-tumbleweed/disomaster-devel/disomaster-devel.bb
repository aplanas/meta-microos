SUMMARY = "Development tools for deepin movie"
DESCRIPTION = "The disomaster-devel package contains the header files and developer docs for \
disomaster movie."
LICENSE = "GPL-3.0-or-later"

PV = "5.0.8"

RPM_NAME = "disomaster-devel-5.0.8-1.4.aarch64.rpm"
RPM_HASH = "1ee3a444b3ea0521929dc0f3562288fb44fb6e430813e61115e1fdd0a8c787c98f660123cba3532f8c0000b681269c1aa6d8abb5a75785b64d9462d0752af6bd"

RPROVIDES:${PN} += "disomaster-devel \
pkgconfig-disomaster"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libdisomaster1"

inherit rpm

SUMMARY = "An EXIF Tag Parsing Library for Digital Cameras (Development files)"
DESCRIPTION = "This library is used to parse EXIF information from JPEGs created by \
digital cameras."
LICENSE = "LGPL-2.1-or-later"

PV = "0.6.24"

RPM_NAME = "libexif-devel-0.6.24-1.9.aarch64.rpm"
RPM_HASH = "b137e8b653161dfa8d88cd9cebc66f0c72f29ac7afbd0086bf3fdcde5f7aa201de768893ba45c1e5f0fba92b467a0c57d321fe2c57c2de43fc90f34004e5f69a"

RPROVIDES:${PN} += "libexif-devel \
libexif-devel(aarch-64) \
pkgconfig(libexif)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libexif12"

inherit rpm

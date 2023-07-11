SUMMARY = "Files for Developing with libwpg"
DESCRIPTION = "libwpg is a C++ library to read and parse graphics in WPG (WordPerfect \
Graphics) format. It is cross-platform, at the moment it can be build \
on Microsoft Windows and Linux. \
 \
This package contains the libwpg development files."
LICENSE = "LGPL-2.1-or-later & MPL-2.0"

PV = "0.3.4"

RPM_NAME = "libwpg-devel-0.3.4-2.2.aarch64.rpm"
RPM_HASH = "ee5b265ccb76d11359b3ede32ea30a256fb6c1c55b24eb5accfa46961577a3090e3c5abb8fb9d034abd59eeb95a495771d5e6b63bdea07c267d2c28c10dbd675"

RPROVIDES:${PN} += "libwpg-devel \
pkgconfig-libwpg-0.3"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libwpg-0-3-3 \
pkgconfig-librevenge-0.0 \
pkgconfig-libwpd-0.10"

inherit rpm

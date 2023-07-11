SUMMARY = "Files for developing with hunspell"
DESCRIPTION = "Includes and definitions for developing with hunspell."
LICENSE = "(GPL-2.0-or-later | LGPL-2.1-or-later | MPL-1.1+) & LGPL-2.1-or-later"

PV = "1.7.2"

RPM_NAME = "hunspell-devel-1.7.2-1.4.aarch64.rpm"
RPM_HASH = "35db45d4d2e4667def039a85d016a515866092f9e6745eac0ff50a4b137ccc2f1b407759f94c7628aa512e059e0667cea1dbd7db10820abcf3fee8df85b1489b"

RPROVIDES:${PN} += "hunspell-devel \
pkgconfig-hunspell"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libhunspell-1-7-0 \
libstdc++-devel"

inherit rpm

SUMMARY = "Files for developing with hunspell"
DESCRIPTION = "Includes and definitions for developing with hunspell."
LICENSE = "(GPL-2.0-or-later | LGPL-2.1-or-later | MPL-1.1+) & LGPL-2.1-or-later"

PV = "1.7.2"

RPM_NAME = "hunspell-devel-1.7.2-1.3.aarch64.rpm"
RPM_HASH = "d3400a72a18d135fd92452170aa35541c8385cae55fb67f942b07a4fa7e4cc43d8cb8d74294581efca875989d61deaa4caa7051bc61eead6e4a8d344e27e0485"

RPROVIDES:${PN} += "hunspell-devel \
pkgconfig-hunspell"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libhunspell-1-7-0 \
libstdc++-devel"

inherit rpm

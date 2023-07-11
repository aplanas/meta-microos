SUMMARY = "Header files for wxsvg"
DESCRIPTION = "Include files for developing programs based on wxsvg."
LICENSE = "LGPL-2.1-or-later-with-WxWindows-exception-3.1"

PV = "1.5.23"

RPM_NAME = "libwxsvg-devel-1.5.23-4.4.aarch64.rpm"
RPM_HASH = "79ae569aa91424eac295081725371a4d6240eac8a4ab2f52b08c287cb0e9b8de060c1a8f8545a1e34415556e0f248508257ecfc20aecde86aa76e7fe34af348a"

RPROVIDES:${PN} += "libwxsvg-devel \
pkgconfig-libwxsvg"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libwxsvg3 \
pkgconfig-expat \
pkgconfig-libart-2.0 \
pkgconfig-libexif \
pkgconfig-pango \
wxGTK3-3-2-devel \
wxsvg"

inherit rpm

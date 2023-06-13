SUMMARY = "Development files for sysprof"
DESCRIPTION = "The sysprof-devel package contains libraries and header files for \
developing applications that use sysprof."
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "3.48.0"

RPM_NAME = "sysprof-devel-3.48.0-2.1.aarch64.rpm"
RPM_HASH = "ce17697cdf14e16c258bfa7cebc6c66b355abc010ce49c244fb37682565533aaa1036b299fcab93f33707aaf8060d3daeb297ad6ef15fec4c74ae01a28ec8de5"

RPROVIDES:${PN} += "pkgconfig(sysprof-4) \
sysprof-devel \
sysprof-devel(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
pkgconfig(gio-2.0) \
pkgconfig(gio-unix-2.0) \
pkgconfig(json-glib-1.0) \
pkgconfig(polkit-gobject-1) \
sysprof"

inherit rpm

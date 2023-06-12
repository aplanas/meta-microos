SUMMARY = "Development Files for Thunar"
DESCRIPTION = "This package provides the development files needed for developing extensions for \
Thunar."
LICENSE = "GPL-2.0-or-later"

PV = "4.18.6"

RPM_NAME = "thunar-devel-4.18.6-1.1.aarch64.rpm"
RPM_HASH = "1076804bc13d46a63deb0b82972273adfacf0832d3602f868b26e7cca0265a2d41ba141312bafc7a0d92310d892990e4fe06fef76a577b9a5f440614ad0d6eaf"

RPROVIDES:${PN} += "pkgconfig(thunarx-3) \
thunar-devel \
thunar-devel(aarch-64) \
thunar-devel-doc"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libthunarx-3-0 \
pkgconfig(gio-2.0) \
pkgconfig(gtk+-3.0) \
thunar"

inherit rpm

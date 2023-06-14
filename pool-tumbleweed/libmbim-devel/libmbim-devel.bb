SUMMARY = "Mobile Broadband Interface Model (MBIM) protocol - Development files"
DESCRIPTION = "libmbim is a glib-based library for talking to WWAN modems and devices \
which speak the Mobile Broadband Interface Model (MBIM) protocol."
LICENSE = "LGPL-2.1-or-later"

PV = "1.28.4"

RPM_NAME = "libmbim-devel-1.28.4-1.1.aarch64.rpm"
RPM_HASH = "19d3678f651de12e059291e4216aa320756444e627a8f53b9f02749816903f6103b686f0c8418f0d6c91e82ace4455aec285faee17a2725591d92219f0ade810"

RPROVIDES:${PN} += "libmbim-devel \
pkgconfig-mbim-glib"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmbim-glib4 \
pkgconfig-gio-2.0 \
pkgconfig-gio-unix-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0"

inherit rpm

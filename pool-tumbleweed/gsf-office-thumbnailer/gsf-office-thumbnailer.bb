SUMMARY = "Office files thumbnailer for the GNOME desktop"
DESCRIPTION = "This package provides a thumbnailer for office files."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.14.50"

RPM_NAME = "gsf-office-thumbnailer-1.14.50-1.5.aarch64.rpm"
RPM_HASH = "a9f1c3fadeb34a6d24b8a3a796e90b6827cc002d87c9864f3a0a127ca78a8473889a247f8d8a8ccbaa06de10a6056a3130f65eecd272fedd27029cb8a183507d"

RPROVIDES:${PN} += "gsf-office-thumbnailer"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-pixbuf-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgsf-1.so.114"

inherit rpm

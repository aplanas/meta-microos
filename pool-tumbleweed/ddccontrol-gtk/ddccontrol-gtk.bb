SUMMARY = "A GTK+2 front-end for ddccontrol"
DESCRIPTION = "This is a graphical tool to configure monitor settings such as brightness \
and contrast via DDC/CI. It is based on ddccontrol."
LICENSE = "GPL-2.0-or-later"

PV = "0.4.2+20140105+git9d89d8c"

RPM_NAME = "ddccontrol-gtk-0.4.2+20140105+git9d89d8c-4.14.aarch64.rpm"
RPM_HASH = "15374817d599d830b43953bfaff874815d67c8e057c39fa1162e74db99d8a61011f736f03e4f5213394576c16fc22c605bba1c2acfb2c6a97956f4669827835c"

RPROVIDES:${PN} += "ddccontrol-gtk"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libddccontrol.so.0 \
libgdk-x11-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgthread-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libpango-1.0.so.0"

inherit rpm

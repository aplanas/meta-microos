SUMMARY = "A GTK+2 front-end for ddccontrol"
DESCRIPTION = "This is a graphical tool to configure monitor settings such as brightness \
and contrast via DDC/CI. It is based on ddccontrol."
LICENSE = "GPL-2.0-or-later"

PV = "0.4.2+20140105+git9d89d8c"

RPM_NAME = "ddccontrol-gtk-0.4.2+20140105+git9d89d8c-4.14.aarch64.rpm"
RPM_HASH = "15374817d599d830b43953bfaff874815d67c8e057c39fa1162e74db99d8a61011f736f03e4f5213394576c16fc22c605bba1c2acfb2c6a97956f4669827835c"

RPROVIDES:${PN} += "application() application(gddccontrol.desktop) ddccontrol-gtk ddccontrol-gtk(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libddccontrol.so.0()(64bit) libgdk-x11-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgthread-2.0.so.0()(64bit) libgtk-x11-2.0.so.0()(64bit) libpango-1.0.so.0()(64bit)"

inherit rpm

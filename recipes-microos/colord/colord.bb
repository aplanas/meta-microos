SUMMARY = "System Daemon for Managing Color Devices"
DESCRIPTION = "colord is a system activated daemon that maps devices to color profiles. \
It is used by gnome-color-manager for system integration and use when \
there are no users logged in."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.6"

RPM_NAME = "colord-1.4.6-2.3.aarch64.rpm"
RPM_HASH = "9e46bdbd75d6a3057b595b04feab15899dc219aa88e50f16a96f906eb5b10edde68874939cfdf758bb5e99dfceff41badfffcf9aed65e2997db6d47fa12b2dd5"

RPROVIDES:${PN} += "colord colord(aarch-64) config(colord) group(colord) libcolord_sensor_argyll.so()(64bit) libcolord_sensor_camera.so()(64bit) libcolord_sensor_colorhug.so()(64bit) libcolord_sensor_dtp94.so()(64bit) libcolord_sensor_dummy.so()(64bit) libcolord_sensor_huey.so()(64bit) libcolord_sensor_scanner.so()(64bit) libcolordcompat.so()(64bit) user(colord)"
RDEPENDS:${PN} += "/bin/sh argyllcms colord-color-profiles ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcolord.so.2()(64bit) libcolordprivate.so.2()(64bit) libcolorhug.so.2()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgmodule-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgudev-1.0.so.0()(64bit) libgusb.so.2()(64bit) libgusb.so.2(LIBGUSB_0.1.0)(64bit) libgusb.so.2(LIBGUSB_0.2.2)(64bit) liblcms2.so.2()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.29)(64bit) libpolkit-gobject-1.so.0()(64bit) libsqlite3.so.0()(64bit) libsystemd.so.0()(64bit) libsystemd.so.0(LIBSYSTEMD_209)(64bit) systemd sysuser-shadow"

inherit rpm

SUMMARY = "The GNOME Display Manager"
DESCRIPTION = "The GNOME Display Manager is a system service that is responsible for \
providing graphical log-ins and managing local and remote displays."
LICENSE = "GPL-2.0-or-later"

PV = "44.1"

RPM_NAME = "gdm-44.1-1.1.aarch64.rpm"
RPM_HASH = "638a8ed52a752415d7cbc1c8c1578544cb857711180ecb332f73f422175db577c3b6e2fbdf023a4af536ea00a266c006fd494e8d5b10fbff2d3264f12f82626e"

RPROVIDES:${PN} += "config(gdm) \
gdm \
gdm(aarch-64) \
gdm2 \
gnome-applets-gdm \
group(gdm) \
user(gdm)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/dbus-run-session \
dconf \
gdm-branding \
gdmflexiserver \
gnome-session-core \
gnome-settings-daemon \
gnome-shell \
group(video) \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11.so.6()(64bit) \
libXau.so.6()(64bit) \
libXdmcp.so.6()(64bit) \
libaccountsservice.so.0()(64bit) \
libaudit.so.1()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcanberra-gtk3.so.0()(64bit) \
libcanberra.so.0()(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgdm.so.1()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libgudev-1.0.so.0()(64bit) \
libkeyutils.so.1()(64bit) \
libkeyutils.so.1(KEYUTILS_0.3)(64bit) \
libkeyutils.so.1(KEYUTILS_1.5)(64bit) \
libpam.so.0()(64bit) \
libpam.so.0(LIBPAM_1.0)(64bit) \
libselinux.so.1()(64bit) \
libselinux.so.1(LIBSELINUX_1.0)(64bit) \
libsystemd.so.0()(64bit) \
libsystemd.so.0(LIBSYSTEMD_209)(64bit) \
libxcb.so.1()(64bit) \
sysuser-shadow \
update-alternatives \
xdm"

inherit rpm

SUMMARY = "The GNOME Display Manager"
DESCRIPTION = "The GNOME Display Manager is a system service that is responsible for \
providing graphical log-ins and managing local and remote displays."
LICENSE = "GPL-2.0-or-later"

PV = "44.1"

RPM_NAME = "gdm-44.1-3.1.aarch64.rpm"
RPM_HASH = "34cd03f646db588862f01ea41315cd70937a1abcaed493021ae7beae1577e6316ff37c490324b81cc18d1d80571ef601069601c4defd1ad22367d31a3e45d856"

RPROVIDES:${PN} += "config-gdm \
gdm \
gdm2 \
gnome-applets-gdm \
group-gdm \
pulseaudio-gdm-hooks \
user-gdm"

RDEPENDS:${PN} += "/usr/bin/dbus-run-session \
/usr/bin/sh \
dconf \
gdm-branding \
gdmflexiserver \
gnome-session-core \
gnome-settings-daemon \
gnome-shell \
group-video \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXau.so.6 \
libXdmcp.so.6 \
libaccountsservice.so.0 \
libaudit.so.1 \
libc.so.6 \
libcanberra-gtk3.so.0 \
libcanberra.so.0 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgdm.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libgudev-1.0.so.0 \
libkeyutils.so.1 \
libpam.so.0 \
libselinux.so.1 \
libsystemd.so.0 \
libxcb.so.1 \
sysuser-shadow \
update-alternatives \
xdm"

inherit rpm

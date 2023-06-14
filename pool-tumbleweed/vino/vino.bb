SUMMARY = "GNOME VNC Server"
DESCRIPTION = "A VNC Server for GNOME"
LICENSE = "GPL-2.0-or-later"

PV = "3.22.0"

RPM_NAME = "vino-3.22.0-9.8.aarch64.rpm"
RPM_HASH = "3607274ba2eee4d820ba79b9b8ddb8738b5f2699495437df4d9181a43c68de128696df0ee7039425b26fec9b2cbfb40178ae4a754ead8d3af2e7c4e2c7eff91c"

RPROVIDES:${PN} += "vino"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libICE.so.6 \
libSM.so.6 \
libX11.so.6 \
libXdamage.so.1 \
libXext.so.6 \
libXfixes.so.3 \
libXtst.so.6 \
libavahi-client.so.3 \
libavahi-common.so.3 \
libavahi-glib.so.1 \
libc.so.6 \
libcairo.so.2 \
libgcrypt.so.20 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgnutls.so.30 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libjpeg.so.8 \
libnotify.so.4 \
libsecret-1.so.0 \
libz.so.1"

inherit rpm

SUMMARY = "MATE Desktop screensaver"
DESCRIPTION = "mate-screensaver is a screen saver and locker that integrates with \
the MATE desktop."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "1.26.2"

RPM_NAME = "mate-screensaver-1.26.2-1.1.aarch64.rpm"
RPM_HASH = "51acc7cf71e418ef82d47a4856dceffa374af3cf7fa5151e9ad8b291571b550eb97cefaacb74a3eb77b5803167a2484fd8fb2f84612239d729438fc7de3bd12f"

RPROVIDES:${PN} += "config-mate-screensaver \
mate-screensaver"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1 \
libGL.so.1 \
libX11.so.6 \
libXext.so.6 \
libXss.so.1 \
libc.so.6 \
libcairo.so.2 \
libdbus-1.so.3 \
libdbus-glib-1.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libm.so.6 \
libmate-desktop-2.so.17 \
libmate-menu.so.2 \
libmatekbdui.so.4 \
libnotify.so.4 \
libpam.so.0 \
libpango-1.0.so.0 \
libsystemd.so.0 \
libxklavier.so.16 \
mate-session-manager-gschemas"

inherit rpm

SUMMARY = "A lightweight X11 desktop panel and task manager"
DESCRIPTION = "tint2 is a simple panel/taskbar made for modern X window managers. It was \
specifically made for Openbox3 but should also work with other window managers."
LICENSE = "GPL-2.0-only"

PV = "17.0.2"

RPM_NAME = "tint2-17.0.2-1.8.aarch64.rpm"
RPM_HASH = "c857f003d6664169ffd7236a81e4bd8810d7be3576f374485453c252f9a24d6d45221cb84027cbb59b816ff9440a5c387613347d05c8aeb298455659af2a1153"

RPROVIDES:${PN} += "config-tint2 \
tint2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libImlib2.so.1 \
libX11.so.6 \
libXcomposite.so.1 \
libXdamage.so.1 \
libXext.so.6 \
libXinerama.so.1 \
libXrandr.so.2 \
libXrender.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
librsvg-2.so.2 \
libstartup-notification-1.so.0"

inherit rpm

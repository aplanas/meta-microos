SUMMARY = "GTK+ 4.0 im module for fcitx5"
DESCRIPTION = "This package provides GTK+ 4.0 im module for fcitx5."
LICENSE = "LGPL-2.1-or-later"

PV = "5.1.0"

RPM_NAME = "fcitx5-gtk4-5.1.0-1.1.aarch64.rpm"
RPM_HASH = "3cf113f5ec9197a47b19f5b00c221017e42dec7edf140a4fe077e7cad2648519054721aca5feb980018ae6aa12cdde07e67a500bf04fd55557648aedb5339fb8"

RPROVIDES:${PN} += "fcitx5-gtk4 \
libim-fcitx5.so"

RDEPENDS:${PN} += "/usr/bin/sh \
glib2-tools \
ld-linux-aarch64.so.1 \
libFcitx5GClient.so.2 \
libX11.so.6 \
libc.so.6 \
libcairo.so.2 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-4.so.1 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libstdc++.so.6 \
libxkbcommon.so.0"

inherit rpm

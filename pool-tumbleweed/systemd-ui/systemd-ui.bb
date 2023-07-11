SUMMARY = "Graphical front-end for systemd"
DESCRIPTION = "Graphical front-end for systemd system and service manager."
LICENSE = "GPL-2.0+"

PV = "3"

RPM_NAME = "systemd-ui-3-1.36.aarch64.rpm"
RPM_HASH = "a7c5116b4faf12374de0eb7a12da99483866c9396df078afecebadd75c80b8b2a31dc675986c3c6a0235b26a5cfd667f44fa8abd3942f2c769bbe4ab3a19b779"

RPROVIDES:${PN} += "systemd-gtk \
systemd-ui"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgee-0.8.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libnotify.so.4 \
systemd"

inherit rpm

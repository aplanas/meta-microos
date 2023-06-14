SUMMARY = "Graphical front-end for systemd"
DESCRIPTION = "Graphical front-end for systemd system and service manager."
LICENSE = "GPL-2.0+"

PV = "3"

RPM_NAME = "systemd-ui-3-1.35.aarch64.rpm"
RPM_HASH = "00879d8629ac035045091ce309774c19d560417b3b9b1fec28e5954ec4e0065ca589cbf52f363406102db73d5dc6628fb896b0cbdbef2f09da805827e1fae3ef"

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

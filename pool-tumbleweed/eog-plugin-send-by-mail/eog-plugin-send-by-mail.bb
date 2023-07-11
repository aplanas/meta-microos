SUMMARY = "Eog send-by-mail plugin"
DESCRIPTION = "The Eye of Gnome Send by Mail plugin"
LICENSE = "GPL-2.0-or-later"

PV = "44.0"

RPM_NAME = "eog-plugin-send-by-mail-44.0-1.2.aarch64.rpm"
RPM_HASH = "2b6e377801c5e650730d0bbc5223a00319f4c8b453a749ca18f65ae5acf29589de5e51f281a8e107ce2e274a434b5be3f20202c60cc680731bfa89d98e48f1f9"

RPROVIDES:${PN} += "eog-plugin-send-by-mail \
eog-plugins-/usr/lib64/eog/plugins/send-by-mail.plugin \
libsend-by-mail.so"

RDEPENDS:${PN} += "eog-plugins-data \
ld-linux-aarch64.so.1 \
libc.so.6 \
libeog.so \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpeas-1.0.so.0"

inherit rpm

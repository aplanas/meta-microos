SUMMARY = "Eog send-by-mail plugin"
DESCRIPTION = "The Eye of Gnome Send by Mail plugin"
LICENSE = "GPL-2.0-or-later"

PV = "44.0"

RPM_NAME = "eog-plugin-send-by-mail-44.0-1.1.aarch64.rpm"
RPM_HASH = "c330255d450d4517d262c4b6974caaf963898d432e1903762a55fcb89da851c97389068c9729ebbbc2795397b94001fb44da679bf261812c29c74178cd3b700b"

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

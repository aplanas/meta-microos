SUMMARY = "Outlook PST importer plugin for the Evolution groupware suite"
DESCRIPTION = "Adds support to import messages from Outlook PST files."
LICENSE = "CC-BY-SA-3.0 & LGPL-2.0-only & LGPL-3.0-only & OLDAP-2.8 & GFDL-1.1-only & GFDL-1.3-only"

PV = "3.48.2"

RPM_NAME = "evolution-plugin-pst-import-3.48.2-1.1.aarch64.rpm"
RPM_HASH = "0cd49172a19f3eb52a574290b3e0e34924eed2f8dcd2f6475b7af4bc445333ceac109aefc2cfecd66649116e4f07a80205de17fbb6096f59e3c191d1a51985bd"

RPROVIDES:${PN} += "evolution-plugin-pst-import \
liborg-gnome-pst-import.so"

RDEPENDS:${PN} += "evolution \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcamel-1.2.so.64 \
libebook-1.2.so.21 \
libebook-contacts-1.2.so.4 \
libecal-2.0.so.2 \
libedataserver-1.2.so.27 \
libemail-engine.so \
libevolution-mail.so \
libevolution-shell.so \
libevolution-util.so \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libical-glib.so.3 \
libpst.so.4"

inherit rpm

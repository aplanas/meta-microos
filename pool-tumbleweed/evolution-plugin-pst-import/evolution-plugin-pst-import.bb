SUMMARY = "Outlook PST importer plugin for the Evolution groupware suite"
DESCRIPTION = "Adds support to import messages from Outlook PST files."
LICENSE = "CC-BY-SA-3.0 & LGPL-2.0-only & LGPL-3.0-only & OLDAP-2.8 & GFDL-1.1-only & GFDL-1.3-only"

PV = "3.48.4"

RPM_NAME = "evolution-plugin-pst-import-3.48.4-1.1.aarch64.rpm"
RPM_HASH = "cc8eed1e00f66e3ce2a6a22232946659516fe2a12a3effd482814f0891186b6139adaf21d43a8de56e5c897bba81ee1f7d915913f4882b52ba2ba0ddc571ed85"

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

SUMMARY = "Outlook PST importer plugin for the Evolution groupware suite"
DESCRIPTION = "Adds support to import messages from Outlook PST files."
LICENSE = "CC-BY-SA-3.0 & LGPL-2.0-only & LGPL-3.0-only & OLDAP-2.8 & GFDL-1.1-only & GFDL-1.3-only"

PV = "3.48.2"

RPM_NAME = "evolution-plugin-pst-import-3.48.2-1.1.aarch64.rpm"
RPM_HASH = "0cd49172a19f3eb52a574290b3e0e34924eed2f8dcd2f6475b7af4bc445333ceac109aefc2cfecd66649116e4f07a80205de17fbb6096f59e3c191d1a51985bd"

RPROVIDES:${PN} += "evolution-plugin-pst-import \
evolution-plugin-pst-import(aarch-64) \
liborg-gnome-pst-import.so()(64bit) \
metainfo() \
metainfo(org.gnome.Evolution-pst.metainfo.xml)"
RDEPENDS:${PN} += "evolution \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.33)(64bit) \
libcamel-1.2.so.64()(64bit) \
libebook-1.2.so.21()(64bit) \
libebook-contacts-1.2.so.4()(64bit) \
libecal-2.0.so.2()(64bit) \
libedataserver-1.2.so.27()(64bit) \
libemail-engine.so()(64bit) \
libevolution-mail.so()(64bit) \
libevolution-shell.so()(64bit) \
libevolution-util.so()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libical-glib.so.3()(64bit) \
libpst.so.4()(64bit)"

inherit rpm

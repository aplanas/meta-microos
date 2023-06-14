SUMMARY = "A dictionary with word definitions"
DESCRIPTION = "palaura is a dictionary application featuring word definitions. \
It uses the Oxford Dictionaries API for lookups."
LICENSE = "GPL-3.0-or-later"

PV = "1.5.1"

RPM_NAME = "palaura-1.5.1-1.12.aarch64.rpm"
RPM_HASH = "c27262abc2e2ba89564b38dcb7035fa01703fe2471071a7af832b7a2255828e71eca0574e4d4d17203e84b627f5ab22cdca69bbd527b4a055c50dcaee932d435"

RPROVIDES:${PN} += "palaura"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-3.so.0 \
libgee-0.8.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgranite.so.6 \
libgtk-3.so.0 \
libgtksourceview-3.0.so.1 \
libjson-glib-1.0.so.0 \
libsoup-2.4.so.1"

inherit rpm

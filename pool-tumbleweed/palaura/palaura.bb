SUMMARY = "A dictionary with word definitions"
DESCRIPTION = "palaura is a dictionary application featuring word definitions. \
It uses the Oxford Dictionaries API for lookups."
LICENSE = "GPL-3.0-or-later"

PV = "1.5.1"

RPM_NAME = "palaura-1.5.1-1.13.aarch64.rpm"
RPM_HASH = "6db765116bcab9ef9f008b1c435818d957bd34881bac94de8f75fc547bba37579eed341bd6d0dd041d7d22824d73d85c32bf873f11bdc08f147c65f6d46b8894"

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

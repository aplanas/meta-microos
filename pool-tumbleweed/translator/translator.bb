SUMMARY = "Translation program"
DESCRIPTION = "This is a translator. It is suited only for small messages, not \
big text. Google Translate is used as a backend."
LICENSE = "GPL-3.0-or-later"

PV = "1.4.1"

RPM_NAME = "translator-1.4.1-1.20.aarch64.rpm"
RPM_HASH = "f31689d23850d62e3e5fd7a78cfd622973050f62fa8e6f8a9bf892b7e2379702dacc4b159c6daf4ab9f8a04bc095cbdcd13a03d075a5a387acc79b3c18544f2b"

RPROVIDES:${PN} += "translator"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgee-0.8.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgranite.so.6 \
libgtk-3.so.0 \
libjson-glib-1.0.so.0 \
libpango-1.0.so.0 \
libsoup-2.4.so.1"

inherit rpm

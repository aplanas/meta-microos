SUMMARY = "Writing application"
DESCRIPTION = "A fullscreen word processor for Elementary OS."
LICENSE = "GPL-3.0-only"

PV = "3.3.4"

RPM_NAME = "quilter-3.3.4-1.11.aarch64.rpm"
RPM_HASH = "f63fca0ad31eadfd3848ab4fca4fb7114eccb8c46741281448eb3f39831faeb11063f703b7a9a5c2f1e527db3b193ba4691d3698bdff0e67d367101488f8bffb"

RPROVIDES:${PN} += "quilter"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-3.so.0 \
libgee-0.8.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libgtksourceview-4.so.0 \
libgtkspell3-3.so.0 \
libhandy-1.so.0 \
libmarkdown.so.3 \
libwebkit2gtk-4.0.so.37"

inherit rpm

SUMMARY = "IDE for The Coq Proof Assistant"
DESCRIPTION = "The Coq Integrated Development Interface is a graphical interface for the Coq proof assistant."
LICENSE = "LGPL-2.1-only"

PV = "8.17.0"

RPM_NAME = "coq-ide-8.17.0-1.1.aarch64.rpm"
RPM_HASH = "f19c40f2ca63c98141d707dcf03413c375dfa9eb455e07ee83e9d1bf91d38875b469570c0ad561cf14c7209a87e77e384f1f50b45b43cbc55242ed8b1af9f3ce"

RPROVIDES:${PN} += "coq-ide"

RDEPENDS:${PN} += "/usr/bin/ocamlrun \
coq \
libc.so.6 \
libcairo.so.2 \
libfontconfig.so.1 \
libfreetype.so.6 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libglib-2.0.so.0 \
libgmp.so.10 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libgtksourceview-3.0.so.1 \
libm.so.6 \
libpango-1.0.so.0"

inherit rpm

SUMMARY = "Utility to look up words in dictionary sources"
DESCRIPTION = "The Dictionary application enables you to search words and terms on a \
dictionary source."
LICENSE = "GPL-2.0-or-later"

PV = "40.0"

RPM_NAME = "gnome-dictionary-40.0-3.7.aarch64.rpm"
RPM_HASH = "090720da73b805f5d9e76e6de2179154424da6e976a1a0743755a1b89659d98df75a476d6a8744536d9c33032097240c05ff3a36eca89a23f3b9a1a01c29dd52"

RPROVIDES:${PN} += "gnome-dictionary"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0"

inherit rpm

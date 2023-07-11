SUMMARY = "Comics document support for Evince"
DESCRIPTION = "A plugin for Evince to read Comics documents."
LICENSE = "GPL-2.0-or-later"

PV = "44.3"

RPM_NAME = "evince-plugin-comicsdocument-44.3-1.1.aarch64.rpm"
RPM_HASH = "beb6ab6a68312ae9788bc5aa7ad6f467de82add3981a85194eb483164e39592b4e98edcebba87ba229e825f16ee240f9f4ea53b317db5e6eca69acca5bc9ad1a"

RPROVIDES:${PN} += "evince-plugin-comicsdocument \
libcomicsdocument.so"

RDEPENDS:${PN} += "evince \
ld-linux-aarch64.so.1 \
libarchive.so.13 \
libc.so.6 \
libevdocument3.so.4 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm

SUMMARY = "Offline English thesaurus based on WordNet"
DESCRIPTION = "Artha is a free cross-platform English thesaurus that works \
completely off-line and is based on WordNet."
LICENSE = "GPL-2.0-only"

PV = "1.0.5"

RPM_NAME = "artha-1.0.5-1.14.aarch64.rpm"
RPM_HASH = "4f1920e99dd776e3a22230457dd71cfc8c793b257769ef30fd36bcb81939fdc22962949c61fd4d1cac45cd67446b40bc866be15452c4e63e2662b684c382adf8"

RPROVIDES:${PN} += "artha"

RDEPENDS:${PN} += "enchant \
hunspell \
ld-linux-aarch64.so.1 \
libWN.so.3 \
libX11.so.6 \
libc.so.6 \
libdbus-1.so.3 \
libdbus-glib-1.so.2 \
libgdk-x11-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0 \
wordnet"

inherit rpm

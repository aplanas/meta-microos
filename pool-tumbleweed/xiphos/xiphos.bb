SUMMARY = "GNOME-based Bible research tool"
DESCRIPTION = "Bible Study Software for the Linux community. Lookup and search Bible texts and \
commentaries. Xiphos uses modules and libraries from the SWORD Project. \
Display multiple translations in the interlinear window. Search for passages in \
any translation by word, phrase, or regular expression. Install this package \
if you want to browse the Bible translations and reference works distributed \
by Crosswire Bible Society through the SWORD Project."
LICENSE = "GPL-2.0-only"

PV = "4.2.1.7"

RPM_NAME = "xiphos-4.2.1.7-1.16.aarch64.rpm"
RPM_HASH = "8a1f0c4c4c5603d99b29f9ce531194fb7e806e37f1d856fec76b66537f12b2de2d3553bdb018d88d5fe2cfea7c3262c13d30fe9c0cc8eec63d2d2f4de043358f"

RPROVIDES:${PN} += "sword-frontend \
xiphos"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbiblesync.so.2.0 \
libc.so.6 \
libdbus-glib-1.so.2 \
libgcc-s.so.1 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libgtkhtml-4.0.so.0 \
libgtkhtml-editor-4.0.so.0 \
libicui18n.so.73 \
libminizip.so.1 \
libstdc++.so.6 \
libsword-1.8.1.so \
libwebkit2gtk-4.0.so.37 \
libxml2.so.2 \
sword"

inherit rpm

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

RPROVIDES:${PN} += "application() \
application(xiphos.desktop) \
metainfo() \
metainfo(xiphos.appdata.xml) \
sword-frontend \
xiphos \
xiphos(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libbiblesync.so.2.0()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libdbus-glib-1.so.2()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgmodule-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libgtkhtml-4.0.so.0()(64bit) \
libgtkhtml-editor-4.0.so.0()(64bit) \
libicui18n.so.73()(64bit) \
libminizip.so.1()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.32)(64bit) \
libsword-1.8.1.so()(64bit) \
libwebkit2gtk-4.0.so.37()(64bit) \
libxml2.so.2()(64bit) \
libxml2.so.2(LIBXML2_2.4.30)(64bit) \
sword"

inherit rpm

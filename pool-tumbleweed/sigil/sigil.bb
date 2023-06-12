SUMMARY = "WYSIWYG Ebook Editor"
DESCRIPTION = "Sigil is an editor for the EPUB format. It is designed for WYSIWYG \
editing of EPUB files and for converting other formats to EPUB. It \
also provides support for direct XHTML, CSS and XPGT editing. You can \
use it to add any of the metadata entries supported by the EPUB \
specification and create a hierarchical Table of Contents."
LICENSE = "GPL-3.0-only"

PV = "1.9.30"

RPM_NAME = "sigil-1.9.30-1.3.aarch64.rpm"
RPM_HASH = "49e29221e103e95f9c9ae3ef9ee9a0582f1639bc4142f5ebe828bc833d34b57f6ce8e07d28a05e6da18634582427c4f08a14c7879b1ffcc856c082fc37664353"

RPROVIDES:${PN} += "application() \
application(sigil.desktop) \
libhunspell.so()(64bit) \
libsigilgumbo.so()(64bit) \
mimehandler(application/epub+zip) \
sigil \
sigil(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3 \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Concurrent.so.5()(64bit) \
libQt5Concurrent.so.5(Qt_5)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5PrintSupport.so.5()(64bit) \
libQt5PrintSupport.so.5(Qt_5)(64bit) \
libQt5WebEngineCore.so.5()(64bit) \
libQt5WebEngineCore.so.5(Qt_5)(64bit) \
libQt5WebEngineWidgets.so.5()(64bit) \
libQt5WebEngineWidgets.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libpython3.10.so.1.0()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.5)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.18)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
python3-Pillow \
python3-certifi \
python3-chardet \
python3-css-parser \
python3-cssselect \
python3-cssutils \
python3-dulwich \
python3-html5lib \
python3-lxml \
python3-regex \
python3-six \
python3-tk \
python3-urllib3"

inherit rpm

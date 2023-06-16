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

RPROVIDES:${PN} += "libhunspell.so \
libsigilgumbo.so \
sigil"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libQt5Concurrent.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5PrintSupport.so.5 \
libQt5WebEngineCore.so.5 \
libQt5WebEngineWidgets.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libpython3.10.so.1.0 \
libstdc++.so.6 \
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

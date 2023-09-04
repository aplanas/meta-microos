SUMMARY = "EBook Management Application"
DESCRIPTION = "Calibre is an ebook library manager. It can view, convert and catalog \
ebooks in most of the major ebook formats. It can also talk to a few \
ebook reader devices. It can go out on the Internet and fetch \
metadata for books. It can download newspapers and convert them \
into ebooks for convenient reading."
LICENSE = "GPL-3.0-only"

PV = "6.25.0"

RPM_NAME = "calibre-6.25.0-1.1.aarch64.rpm"
RPM_HASH = "76f2d9303707ee92a3ad3c5b947072792a832a11fdb435c06e007c1dfc312f7403ab4e15b0c66d739c8e75e842ecd8c61e307a25cdd9546f68de5ea482148108"

RPROVIDES:${PN} += "calibre \
libheadless.so \
libmtp.so \
libusb.so"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3.11 \
bzip2 \
chmlib \
expat \
findutils \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libcrypto.so.3 \
liberation-fonts \
libfreetype.so.6 \
libgcc-s.so.1 \
libhunspell-1.7.so.0 \
libhyphen.so.0 \
libicui18n.so.73 \
libicuuc.so.73 \
libm.so.6 \
libmtp.so.9 \
libmtp9 \
libpng16-16 \
libpodofo.so.2 \
libpython3.11.so.1.0 \
libsqlite3-0 \
libstdc++.so.6 \
libstemmer.so.0d \
libuchardet.so.0 \
libusb-1.0.so.0 \
libwmf \
optipng \
podofo \
poppler-tools \
python-abi \
python3-speechd \
python311 \
python311-Brotli \
python311-FontTools \
python311-Markdown \
python311-Pillow \
python311-PyQt6-sip \
python311-Pygments \
python311-apsw \
python311-beautifulsoup4 \
python311-cchardet \
python311-chardet \
python311-css-parser \
python311-dateutil \
python311-dnspython \
python311-dukpy-kovidgoyal \
python311-feedparser \
python311-html2text \
python311-html5-parser \
python311-html5lib \
python311-ifaddr \
python311-jeepney \
python311-lxml \
python311-mechanize \
python311-msgpack \
python311-netifaces \
python311-odfpy \
python311-psutil \
python311-py7zr \
python311-pychm \
python311-pycryptodome \
python311-pyzstd \
python311-qt6 \
python311-qtwebengine-qt6 \
python311-regex \
python311-sgmllib3k \
python311-six \
python311-soupsieve \
python311-texttable \
python311-webencodings \
python311-zeroconf \
sqlite3 \
unrar \
xdg-utils \
xz \
zlib"

inherit rpm

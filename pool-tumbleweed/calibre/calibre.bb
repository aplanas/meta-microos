SUMMARY = "EBook Management Application"
DESCRIPTION = "Calibre is an ebook library manager. It can view, convert and catalog \
ebooks in most of the major ebook formats. It can also talk to a few \
ebook reader devices. It can go out on the Internet and fetch \
metadata for books. It can download newspapers and convert them \
into ebooks for convenient reading."
LICENSE = "GPL-3.0-only"

PV = "6.17.0"

RPM_NAME = "calibre-6.17.0-1.2.aarch64.rpm"
RPM_HASH = "97ba46fc6100862652530050ace9776f16fc1f01eaf4a9ea49e72ab3cc9528e76972690c0a2027f364aaa086f3981956b41ee4a98418f2fda25715703a156a89"

RPROVIDES:${PN} += "calibre \
libheadless.so \
libmtp.so \
libusb.so"

RDEPENDS:${PN} += "/bin/bash \
/usr/bin/python3 \
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
libpodofo.so.0.9.8 \
libpython3.10.so.1.0 \
libstdc++.so.6 \
libstemmer.so.0d \
libuchardet.so.0 \
libusb-1.0.so.0 \
libwmf \
optipng \
podofo \
poppler-tools \
python-abi \
python3 \
python3-Brotli \
python3-FontTools \
python3-Markdown \
python3-Pillow \
python3-PyQt6-sip \
python3-Pygments \
python3-apsw \
python3-beautifulsoup4 \
python3-cchardet \
python3-chardet \
python3-css-parser \
python3-dateutil \
python3-dnspython \
python3-dukpy-kovidgoyal \
python3-feedparser \
python3-html2text \
python3-html5-parser \
python3-html5lib \
python3-ifaddr \
python3-jeepney \
python3-lxml \
python3-mechanize \
python3-msgpack \
python3-netifaces \
python3-odfpy \
python3-psutil \
python3-py7zr \
python3-pychm \
python3-pycryptodome \
python3-pyzstd \
python3-qt6 \
python3-qtwebengine-qt6 \
python3-regex \
python3-sgmllib3k \
python3-six \
python3-soupsieve \
python3-speechd \
python3-texttable \
python3-webencodings \
python3-zeroconf \
sqlite3 \
unrar \
xdg-utils \
xz \
zlib"

inherit rpm

SUMMARY = "EBook Management Application"
DESCRIPTION = "Calibre is an ebook library manager. It can view, convert and catalog \
ebooks in most of the major ebook formats. It can also talk to a few \
ebook reader devices. It can go out on the Internet and fetch \
metadata for books. It can download newspapers and convert them \
into ebooks for convenient reading."
LICENSE = "GPL-3.0-only"

PV = "6.17.0"

RPM_NAME = "calibre-6.17.0-1.1.aarch64.rpm"
RPM_HASH = "facc00b4f0088f23d5abae632096118815ea5921f8592e2736d134661e9dddd629b9d404c1dad614a62be106511e1970e7f7728be8408752089b6f18e6a7f18c"

RPROVIDES:${PN} += "application() application(calibre-gui.desktop) calibre calibre(aarch-64) libheadless.so()(64bit) libmtp.so()(64bit) libusb.so()(64bit) metainfo() metainfo(calibre-gui.metainfo.xml)"
RDEPENDS:${PN} += "/bin/bash /usr/bin/python3 bzip2 chmlib expat findutils ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6Gui.so.6()(64bit) libQt6Gui.so.6(Qt_6)(64bit) libQt6Gui.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6Widgets.so.6()(64bit) libQt6Widgets.so.6(Qt_6)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) liberation-fonts libfreetype.so.6()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libhunspell-1.7.so.0()(64bit) libhyphen.so.0()(64bit) libicui18n.so.72()(64bit) libicuuc.so.72()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.27)(64bit) libm.so.6(GLIBC_2.29)(64bit) libmtp.so.9()(64bit) libmtp9 libpng16-16 libpodofo.so.0.9.8()(64bit) libpython3.10.so.1.0()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.5)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) libstemmer.so.0d()(64bit) libuchardet.so.0()(64bit) libusb-1.0.so.0()(64bit) libwmf optipng podofo poppler-tools python(abi) python3 python3-Brotli python3-FontTools python3-Markdown python3-Pillow python3-PyQt6-sip python3-Pygments python3-apsw python3-beautifulsoup4 python3-cchardet python3-chardet python3-css-parser python3-dateutil python3-dnspython python3-dukpy-kovidgoyal python3-feedparser python3-html2text python3-html5-parser python3-html5lib python3-ifaddr python3-jeepney python3-lxml python3-mechanize python3-msgpack python3-netifaces python3-odfpy python3-psutil python3-py7zr python3-pychm python3-pycryptodome python3-pyzstd python3-qt6 python3-qtwebengine-qt6 python3-regex python3-sgmllib3k python3-six python3-soupsieve python3-speechd python3-texttable python3-webencodings python3-zeroconf sqlite3 unrar xdg-utils xz zlib"

inherit rpm

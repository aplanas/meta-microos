SUMMARY = "E-book reader"
DESCRIPTION = "A multi-platform ebook reader which supports popular ebook formats: \
ePub, fb2, mobi, rtf, html, plain text, and a lot of other formats. \
It provides access to popular network libraries that contain a large \
set of ebooks. Download books for free or for a fee. Add your own \
catalog. Highly customizable. Choose colors, fonts, page turning \
animations, dictionaries, bookmarks, etc. to make reading as \
convenient as you want."
LICENSE = "GPL-2.0+"

PV = "0.99.4"

RPM_NAME = "fbreader-0.99.4-3.27.aarch64.rpm"
RPM_HASH = "50de4586016782f0edb5785bc16642f261fe58f0f9efea0214325c84d4b625c3c0d49a1a874426f88bc7e429bce692f7c60463d4cfc2ff55b19c1b18969b03b4"

RPROVIDES:${PN} += "application() \
application(FBReader.desktop) \
fbreader \
fbreader(aarch-64) \
mimehandler(application/x-fictionbook+xml)"

RDEPENDS:${PN} += "libc.so.6()(64bit) \
libsqlite3.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libzlcore.so.0.99()(64bit) \
libzltext.so.0.99()(64bit) \
libzlui.so.0.99()(64bit)"

inherit rpm

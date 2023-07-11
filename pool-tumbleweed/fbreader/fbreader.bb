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

RPM_NAME = "fbreader-0.99.4-3.28.aarch64.rpm"
RPM_HASH = "2b8c47e8111089c16edc72b661b149dfb67e553a8b45fc3d251fe3f316a24d414501bc6b691a42c0269dc8c22bf027a17d7c8bb7b1c2e1b1dc3f9216c32fa4c0"

RPROVIDES:${PN} += "fbreader"

RDEPENDS:${PN} += "libc.so.6 \
libsqlite3.so.0 \
libstdc++.so.6 \
libzlcore.so.0.99 \
libzltext.so.0.99 \
libzlui.so.0.99"

inherit rpm

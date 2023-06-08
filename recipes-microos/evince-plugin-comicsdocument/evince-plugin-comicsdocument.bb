SUMMARY = "Comics document support for Evince"
DESCRIPTION = "A plugin for Evince to read Comics documents."
LICENSE = "GPL-2.0-or-later"

PV = "44.1"

RPM_NAME = "evince-plugin-comicsdocument-44.1-1.1.aarch64.rpm"
RPM_HASH = "27bca97f8874cf1ce791e2f3e7612fb477539d19ac6a4ab2c558dbc15420b9f217ea6c911e7b1c3771bbc04280d416b2800bd5e2a9d5962d2fa162bf5c04f8dd"

RPROVIDES:${PN} += "evince-plugin-comicsdocument evince-plugin-comicsdocument(aarch-64) libcomicsdocument.so()(64bit) metainfo() metainfo(evince-comicsdocument.metainfo.xml)"
RDEPENDS:${PN} += "evince ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libarchive.so.13()(64bit) libc.so.6(GLIBC_2.17)(64bit) libevdocument3.so.4()(64bit) libgdk_pixbuf-2.0.so.0()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit)"

inherit rpm

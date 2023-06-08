SUMMARY = "Dropbox client integrated into Caja"
DESCRIPTION = "Dropbox is a proprietary service that lets one bring photos, \
documents, and videos anywhere and share them easily. \
 \
This package integrates Dropbox seamlessly into Caja."
LICENSE = "GPL-3.0-or-later"

PV = "1.26.0"

RPM_NAME = "caja-extension-dropbox-1.26.0-1.9.aarch64.rpm"
RPM_HASH = "a46397e8e61d05c01d85fe778ba914269408e1341e895067eae6b926936f200cfb1ff5b2117d9ff91f9d5fa4cc0e5c0f09bd18771757a91c7102ecd76d9fdcd7"

RPROVIDES:${PN} += "caja-dropbox caja-extension-dropbox caja-extension-dropbox(aarch-64) libcaja-dropbox.so()(64bit)"
RDEPENDS:${PN} += "caja dropbox ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libcaja-extension.so.1()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-3.so.0()(64bit)"

inherit rpm

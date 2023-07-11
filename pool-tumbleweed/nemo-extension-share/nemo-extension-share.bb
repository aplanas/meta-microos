SUMMARY = "Samba share extension for Nemo file manager"
DESCRIPTION = "Nemo Share allows you to quickly share a folder from the Cinnamon \
Nemo file manager without requiring root access."
LICENSE = "GPL-2.0-or-later"

PV = "5.2.0"

RPM_NAME = "nemo-extension-share-5.2.0-3.6.aarch64.rpm"
RPM_HASH = "691b613490cfa533bc83d47b40e3f3aca0d8115bc880002f1571123c44de9439e66b2d4fe58a6c4d9c4e5644ab70a1afd69109848c16e18f4cfbe13cd508bf31"

RPROVIDES:${PN} += "libnemo-share.so \
nemo-extension-share \
nemo-share"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/python3 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libnemo-extension.so.1 \
nemo"

inherit rpm

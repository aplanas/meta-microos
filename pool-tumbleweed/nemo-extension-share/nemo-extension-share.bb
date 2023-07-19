SUMMARY = "Samba share extension for Nemo file manager"
DESCRIPTION = "Nemo Share allows you to quickly share a folder from the Cinnamon \
Nemo file manager without requiring root access."
LICENSE = "GPL-2.0-or-later"

PV = "5.2.0"

RPM_NAME = "nemo-extension-share-5.2.0-4.1.aarch64.rpm"
RPM_HASH = "b584cec2c00f76f8da94d0f0ded0f02b6c6090898a116d97b0794345f5105c8f2e1449e8a184bca9db62d3230b1a76121055c2ec483f8cf6dbe6d665c8ba54da"

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

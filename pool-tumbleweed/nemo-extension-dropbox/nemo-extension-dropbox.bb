SUMMARY = "DropBox support for the Nemo Filemanager"
DESCRIPTION = "Nemo-dropbox adds DropBox support to the Nemo filemanager."
LICENSE = "GPL-3.0-or-later"

PV = "5.2.0"

RPM_NAME = "nemo-extension-dropbox-5.2.0-4.1.aarch64.rpm"
RPM_HASH = "dcdfae112fa24598f7a72df21c8e4bab75e3b4460fb259d9eee440f14d8c2966657ae731bfbddc57332d1d20c9f51b43f745aff3e8f0bb3e2d50a67f73f718bc"

RPROVIDES:${PN} += "libnemo-dropbox.so \
nemo-dropbox \
nemo-extension-dropbox"

RDEPENDS:${PN} += "/sbin/ldconfig \
dropbox \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libnemo-extension.so.1 \
nemo"

inherit rpm

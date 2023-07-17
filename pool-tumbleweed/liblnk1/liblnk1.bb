SUMMARY = "Library to access the Windows Shortcut File (LNK) format"
DESCRIPTION = "liblnk is a library to access Windows Shortcut File (LNK) files."
LICENSE = "LGPL-3.0-or-later"

PV = "20230205"

RPM_NAME = "liblnk1-20230205-1.8.aarch64.rpm"
RPM_HASH = "4662bfa443fabeda91920eb5d866c51e29a4f26274a6a56492287c4bc12e1069d7440e7e2fd03eecedb5cd301a85ddc98a1024ca2fdbfd6119e1fd77d6af853b"

RPROVIDES:${PN} += "liblnk.so.1 \
liblnk1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcdata.so.1 \
libcerror.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libuna.so.1"

inherit rpm

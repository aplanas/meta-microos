SUMMARY = "Library to access the Windows Shortcut File (LNK) format"
DESCRIPTION = "liblnk is a library to access Windows Shortcut File (LNK) files."
LICENSE = "LGPL-3.0-or-later"

PV = "20230205"

RPM_NAME = "liblnk1-20230205-1.4.aarch64.rpm"
RPM_HASH = "b70d836ec4f7e0c903826c702cb312be6821438a5a8aa00863256e5aaf6414f2f3e2dbf0d4fec81fbf13b9198175fa88e943dde71fb60e1981aff54da1ae0b7d"

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

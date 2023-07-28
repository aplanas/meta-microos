SUMMARY = "Library to access the Windows Shortcut File (LNK) format"
DESCRIPTION = "liblnk is a library to access Windows Shortcut File (LNK) files."
LICENSE = "LGPL-3.0-or-later"

PV = "20230716"

RPM_NAME = "liblnk1-20230716-1.1.aarch64.rpm"
RPM_HASH = "6340e158b847f1f07799808cb555d992a517beab2b9d8d8bbac637ca7d630363563402e35b32a48a401344617ab055d7a33a13a9412096403c839658739fcc84"

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

SUMMARY = "Library and tools to access the Windows Shortcut File (LNK) format"
DESCRIPTION = "liblnk is a library and tools to access Windows Shortcut File (LNK) format files."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20230716"

RPM_NAME = "python39-liblnk-20230716-2.1.aarch64.rpm"
RPM_HASH = "e695e4fab94de9d67082c89da0d87e54895de55fa7a9778d8e86dfdc92701051c5722e564abcedb2462ee89d7364859cd46e5c66b5bc3992fc28607d4ec9cf7e"

RPROVIDES:${PN} += "python39-liblnk"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libfguid.so.1 \
liblnk.so.1 \
libuna.so.1 \
python-abi"

inherit rpm

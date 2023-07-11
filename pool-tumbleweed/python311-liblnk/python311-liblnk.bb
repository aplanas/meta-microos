SUMMARY = "Library and tools to access the Windows Shortcut File (LNK) format"
DESCRIPTION = "liblnk is a library and tools to access Windows Shortcut File (LNK) format files."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20230205"

RPM_NAME = "python311-liblnk-20230205-1.7.aarch64.rpm"
RPM_HASH = "57d7f80f06591ed56c9c3e783d24e17573ec57a1f39523ff16c71857516ea1a8eed40856a09153caf6dd041605594d31b18768be4a00d4d0dbdee46efb79831d"

RPROVIDES:${PN} += "python3-liblnk \
python311-liblnk"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libfguid.so.1 \
liblnk.so.1 \
python-abi"

inherit rpm

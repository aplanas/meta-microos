SUMMARY = "Library and tools to access the Windows Shortcut File (LNK) format"
DESCRIPTION = "liblnk is a library and tools to access Windows Shortcut File (LNK) format files."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20230205"

RPM_NAME = "python310-liblnk-20230205-1.8.aarch64.rpm"
RPM_HASH = "c5291bc5c5fa230d1279ba8b8d5206b47f037ff994a17ef68545e138f276b7b9d2228aae109ef97cb8ee762510fc3200ceb453a6030d1fc4e5c6d9af6ffbd880"

RPROVIDES:${PN} += "python310-liblnk"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libfguid.so.1 \
liblnk.so.1 \
python-abi"

inherit rpm

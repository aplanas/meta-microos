SUMMARY = "Library and tools to access the Windows Shortcut File (LNK) format"
DESCRIPTION = "liblnk is a library and tools to access Windows Shortcut File (LNK) format files."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20230205"

RPM_NAME = "python310-liblnk-20230205-1.7.aarch64.rpm"
RPM_HASH = "5238837c63880435b1659537d6b952c6c50a5ae12c8a0cfff2a689c6fdf64cdb66258c47725f9a9fa21292cec651f585dbd5ac2edd9fef662200cb3c659f6165"

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

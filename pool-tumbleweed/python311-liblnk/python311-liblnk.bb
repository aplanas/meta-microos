SUMMARY = "Library and tools to access the Windows Shortcut File (LNK) format"
DESCRIPTION = "liblnk is a library and tools to access Windows Shortcut File (LNK) format files."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20230205"

RPM_NAME = "python311-liblnk-20230205-1.4.aarch64.rpm"
RPM_HASH = "b300564726c96cfb848e811ffb1d460dc3feb758ed0a87bee2c24f9a6de73cac8f2a91b4c20aa157fd92b80b0ba08a183fafbd5a6c6cb340535e62e37dcc7c10"

RPROVIDES:${PN} += "python311-liblnk"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libfguid.so.1 \
liblnk.so.1 \
python-abi"

inherit rpm

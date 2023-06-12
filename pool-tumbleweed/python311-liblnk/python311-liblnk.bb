SUMMARY = "Library and tools to access the Windows Shortcut File (LNK) format"
DESCRIPTION = "liblnk is a library and tools to access Windows Shortcut File (LNK) format files."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20230205"

RPM_NAME = "python311-liblnk-20230205-1.4.aarch64.rpm"
RPM_HASH = "b300564726c96cfb848e811ffb1d460dc3feb758ed0a87bee2c24f9a6de73cac8f2a91b4c20aa157fd92b80b0ba08a183fafbd5a6c6cb340535e62e37dcc7c10"

RPROVIDES:${PN} += "python311-liblnk \
python311-liblnk(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libbfio.so.1()(64bit) \
libbfio.so.1(V_20221025)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcerror.so.1()(64bit) \
libcerror.so.1(V_20220101)(64bit) \
libclocale.so.1()(64bit) \
libclocale.so.1(V_20221218)(64bit) \
libfguid.so.1()(64bit) \
libfguid.so.1(V_20220113)(64bit) \
liblnk.so.1()(64bit) \
liblnk.so.1(V_20230205)(64bit) \
python(abi)"

inherit rpm

SUMMARY = "Library and tools to access the Windows Shortcut File (LNK) format"
DESCRIPTION = "liblnk is a library and tools to access Windows Shortcut File (LNK) format files."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20230205"

RPM_NAME = "python310-liblnk-20230205-1.4.aarch64.rpm"
RPM_HASH = "984ed70c85f8d26aa8e0ce471b3ec5f6cd1f54306148f51cef64e5546297d03566293f87257fd602eab77c7a79fcf2249bd4cc550b4ba4862e672d45fe956d7a"

RPROVIDES:${PN} += "python3-liblnk \
python310-liblnk \
python310-liblnk(aarch-64)"

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

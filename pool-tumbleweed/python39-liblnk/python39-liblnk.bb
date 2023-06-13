SUMMARY = "Library and tools to access the Windows Shortcut File (LNK) format"
DESCRIPTION = "liblnk is a library and tools to access Windows Shortcut File (LNK) format files."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20230205"

RPM_NAME = "python39-liblnk-20230205-1.4.aarch64.rpm"
RPM_HASH = "52357ee3c7ce10cdc2bede9df902984fd143b8e7b992301da955eca8ed2ab80b028ef78b9905660e03f652e567bd157f418db769f7eef8afa5e07ab079c2ad40"

RPROVIDES:${PN} += "python39-liblnk \
python39-liblnk(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libbfio.so.1()(64bit) \
libbfio.so.1(V_20221025)(64bit) \
libc.so.6()(64bit) \
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

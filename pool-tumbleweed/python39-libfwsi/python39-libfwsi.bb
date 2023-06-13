SUMMARY = "Library to access the Windows Shell Item format"
DESCRIPTION = "Library to access the Windows Shell Item format for the libyal family of libraries. \
libyal is typically used in digital forensic tools."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20230114"

RPM_NAME = "python39-libfwsi-20230114-1.4.aarch64.rpm"
RPM_HASH = "7a7e56e756a382b03358d9c89546269e0fe13d1c534bfd07e71f63fe2acea47b0537547888c8b0b8891b21bee1e978c3605436df786e3def2bf1c2b6112f399f"

RPROVIDES:${PN} += "python39-libfwsi \
python39-libfwsi(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcerror.so.1()(64bit) \
libcerror.so.1(V_20220101)(64bit) \
libclocale.so.1()(64bit) \
libclocale.so.1(V_20221218)(64bit) \
libfguid.so.1()(64bit) \
libfguid.so.1(V_20220113)(64bit) \
libfwsi.so.1()(64bit) \
libfwsi.so.1(V_20230114)(64bit) \
python(abi)"

inherit rpm

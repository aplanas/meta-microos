SUMMARY = "Library for Windows NT data types"
DESCRIPTION = "Library to provide Windows NT data type support for the libyal family of libraries. \
libyal is typically used in digital forensic tools."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20220922"

RPM_NAME = "python310-libfwnt-20220922-2.5.aarch64.rpm"
RPM_HASH = "1f4f5f9f2027c5ed4afb33a16a958db13076ae4b9c83ef233ee076b65f40ea8903027eb96293af2fc4cbd7c4c6da18d686a24c5e035ba843ece800486d7635d9"

RPROVIDES:${PN} += "python3-libfwnt \
python310-libfwnt \
python310-libfwnt(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcerror.so.1()(64bit) \
libcerror.so.1(V_20220101)(64bit) \
libfwnt.so.1()(64bit) \
libfwnt.so.1(V_20220922)(64bit) \
python(abi)"

inherit rpm

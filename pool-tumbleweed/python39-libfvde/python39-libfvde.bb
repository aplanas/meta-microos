SUMMARY = "Library to access the File Vault Drive Encryption format"
DESCRIPTION = "libfvde is a library to access the File Vault Drive Encryption format."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20220915"

RPM_NAME = "python39-libfvde-20220915-3.11.aarch64.rpm"
RPM_HASH = "4a714e8b5d9f8b78c4945a175e7095ad069a2adf7507a94750d3facc2558db4ff2aaa0d23ef7e28cf02f86f83147bcc602b44bca640e43ffe5b6d4a093d2119a"

RPROVIDES:${PN} += "python39-libfvde \
python39-libfvde(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libbfio.so.1()(64bit) \
libbfio.so.1(V_20221025)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcerror.so.1()(64bit) \
libcerror.so.1(V_20220101)(64bit) \
libfguid.so.1()(64bit) \
libfguid.so.1(V_20220113)(64bit) \
libfvde.so.1()(64bit) \
libfvde.so.1(V_20220915)(64bit) \
python(abi)"

inherit rpm

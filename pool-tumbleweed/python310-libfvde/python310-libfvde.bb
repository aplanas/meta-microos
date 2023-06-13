SUMMARY = "Library to access the File Vault Drive Encryption format"
DESCRIPTION = "libfvde is a library to access the File Vault Drive Encryption format."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20220915"

RPM_NAME = "python310-libfvde-20220915-3.11.aarch64.rpm"
RPM_HASH = "42cf34bcaae19fbfee17044e51d969efbe997f2032305e09d81efaf81e3734d1963f8813fca11273f7470fd1bd4a33fa12392d39fe4f14c8acb050f5a8370827"

RPROVIDES:${PN} += "python3-libfvde \
python310-libfvde \
python310-libfvde(aarch-64)"

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

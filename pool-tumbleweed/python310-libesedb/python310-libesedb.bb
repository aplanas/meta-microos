SUMMARY = "Library and tools to access the ESE Database File (EDB) format"
DESCRIPTION = "Library and tools to access the Extensible Storage Engine (ESE) Database File \
(EDB) format. ESEDB is used in may different applications like Windows Search, \
Windows Mail, Exchange, Active Directory, etc."
LICENSE = "GFDL-1.1-or-later & LGPL-3.0-or-later & GFDL-1.3-or-later"

PV = "20230318"

RPM_NAME = "python310-libesedb-20230318-1.2.aarch64.rpm"
RPM_HASH = "5674266e684bb56c449c44d4d32afe4fc92b5fa423f26a1b1dbf69060de7007dddf536eb7c2e413bbb898086624e041dd353a45e1c4603691195dbd9bc159725"

RPROVIDES:${PN} += "python3-libesedb \
python310-libesedb \
python310-libesedb(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libbfio.so.1()(64bit) \
libbfio.so.1(V_20221025)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcerror.so.1()(64bit) \
libcerror.so.1(V_20220101)(64bit) \
libesedb.so.1()(64bit) \
libesedb.so.1(V_20230318)(64bit) \
python(abi)"

inherit rpm

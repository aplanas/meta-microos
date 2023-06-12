SUMMARY = "An extended version of CSparse"
DESCRIPTION = "CXSparse is an extended version of CSparse, with support for double \
or complex matrices, with int or long integers. \
 \
CXSparse is part of the SuiteSparse sparse matrix suite."
LICENSE = "LGPL-2.1-or-later"

PV = "3.2.0"

RPM_NAME = "libcxsparse3-3.2.0-49.1.aarch64.rpm"
RPM_HASH = "394fb148ed08a108d934a975a5256146b598f81f8f204e4438419921771a011df0e5010c0f41cc6691952571f6f27ceb328caabf0db4a2f1d8590e4ebb24eecb"

RPROVIDES:${PN} += "libcxsparse-3_2_0 \
libcxsparse.so.3()(64bit) \
libcxsparse3 \
libcxsparse3(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit)"

inherit rpm

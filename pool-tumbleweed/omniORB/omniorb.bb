SUMMARY = "A robust high performance CORBA ORB for C++ and Python"
DESCRIPTION = "omniORB is a robust high performance CORBA ORB for C++ and Python. \
 \
It adheres to version 2.6 of the CORBA specification and is fully \
interoperable with other CORBA ORBs."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "4.3.0"

RPM_NAME = "omniORB-4.3.0-2.6.aarch64.rpm"
RPM_HASH = "50f107b39960bfd2e7402f7f463742281f5570d28c55779582f885eb672c02d380589557ea921d158f574420f9584e97f1cd9b1e3b82c589c16c6cf82a673913"

RPROVIDES:${PN} += "omniORB \
omniORB(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/python3 \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libgcc_s.so.1(GCC_4.5.0)(64bit) \
libomniORB4.so.3()(64bit) \
libomnithread.so.4()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
python(abi)"

inherit rpm

SUMMARY = "The kim-api library"
DESCRIPTION = "OpenKIM is an online framework for making molecular simulations reliable, \
reproducible, and portable.  Models conforming to the KIM application \
programming interface work seamlessly with major simulation codes that have \
adopted the KIM-API standard. \
 \
This package contains the kim-api library."
LICENSE = "LGPL-2.1-or-later"

PV = "2.3.0"

RPM_NAME = "libkim-api2-2.3.0-1.8.aarch64.rpm"
RPM_HASH = "8bd197182c2ba1457db9f0551d1fd30ed073ed654eb3460fcfb199ffa68a274e9e649d956188d39948f1540eaab3b1e559617ea24d2a276856164ad8294d9a8e"

RPROVIDES:${PN} += "libkim-api.so.2()(64bit) \
libkim-api2 \
libkim-api2(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libgfortran.so.5()(64bit) \
libgfortran.so.5(GFORTRAN_8)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.1)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.26)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm

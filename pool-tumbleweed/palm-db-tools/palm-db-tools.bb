SUMMARY = "convert text files into several PalmOS database formats"
DESCRIPTION = "The palm-db-tools package convert text files to several flat-file \
database formats. The currently supported formats are: DB \
http://pilot-db.sourceforge.net/ MobileDB \
http://www.mobilegeneration.com/products/mobiledb/ List \
http://www.magma.ca/~roo/list/list.html JFile v3.x (v4.x will be \
supported later) http://www.land-j.com/jfile.html"
LICENSE = "GPL-2.0+"

PV = "0.3.6"

RPM_NAME = "palm-db-tools-0.3.6-276.28.aarch64.rpm"
RPM_HASH = "715054b739b1ad54ed4df7771ea21364eb867eff028d677db0ce3c5cb4ec712c9fcc8ae3b2bad69590a4f09d543ee8c7b758ea6622e5e4fd69a97218b76f898e"

RPROVIDES:${PN} += "libpdbtools.so()(64bit) \
palm-db-tools \
palm-db-tools(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.1)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.26)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm

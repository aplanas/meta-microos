SUMMARY = "High Dynamic Range Image and Video manipulation tools"
DESCRIPTION = "The pfstools package is a set of command line (and one GUI) programs \
for reading, writing, manipulating and viewing high-dynamic range \
(HDR) images and video frames. All programs in the package exchange \
data using the pfs file format for HDR data. The concept of pfstools \
is similar to netpbm for low-dynamic range images."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.2.0"

RPM_NAME = "pfstools-2.2.0-3.14.aarch64.rpm"
RPM_HASH = "0b7462b0db717c1d76facd4a802534534cb43a3ca9e4437afc4794a804aea76a935bc717e9e179c4ecb2d49c4d31964ee0eda9804275a0c87250d5ddc795e9f1"

RPROVIDES:${PN} += "pfstools \
pfstools(aarch-64)"
RDEPENDS:${PN} += "/bin/bash \
/usr/bin/bash \
/usr/bin/python3 \
dcraw \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libMagick++-7.Q16HDRI.so.5()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.27)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libnetpbm.so.11()(64bit) \
libpfs.so.2()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.1)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.26)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
libtiff.so.6()(64bit) \
libtiff.so.6(LIBTIFF_4.0)(64bit)"

inherit rpm

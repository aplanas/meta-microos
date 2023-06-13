SUMMARY = "Tools from Exempi, an XMP support library"
DESCRIPTION = "Exempi is a library for XMP parsing and I/O. XMP is a kind of \
metadata for images and PDF. \
 \
This subpackage contains utilities from the Exempi project."
LICENSE = "BSD-3-Clause"

PV = "2.6.3"

RPM_NAME = "exempi-tools-2.6.3-1.3.aarch64.rpm"
RPM_HASH = "6c76f9be64bd85289ab4265ab8ba8617bee3b0c13d5d2b5f8c4ee32805bf5a56e2cda711f9c334dc1bbb0b77161d942bc90aee6355abc37daca2a5ed508f9adf"

RPROVIDES:${PN} += "exempi-tools \
exempi-tools(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libexempi.so.8()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit)"

inherit rpm

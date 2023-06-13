SUMMARY = "Command line programs for GDCM"
DESCRIPTION = "This package includes tools to convert, anonymize, manipulate, \
concatenate, and view DICOM files."
LICENSE = "BSD-3-Clause"

PV = "3.0.21"

RPM_NAME = "gdcm-applications-3.0.21-1.5.aarch64.rpm"
RPM_HASH = "8033574b60f39eb5533fb291e255cf300a79249c84c88f84165b75e0ac13c3fa815486a27576c7e3eda6a6cb8b8383f610a5293eae0a2d4c92d33eca46499266"

RPROVIDES:${PN} += "gdcm-applications \
gdcm-applications(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libgdcm3_0 \
libgdcmCommon.so.3.0()(64bit) \
libgdcmDICT.so.3.0()(64bit) \
libgdcmDSED.so.3.0()(64bit) \
libgdcmIOD.so.3.0()(64bit) \
libgdcmMEXD.so.3.0()(64bit) \
libgdcmMSFF.so.3.0()(64bit) \
libpoppler.so.128()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.26)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
libxml2.so.2()(64bit) \
libxml2.so.2(LIBXML2_2.4.30)(64bit) \
libxml2.so.2(LIBXML2_2.5.0)(64bit) \
libxml2.so.2(LIBXML2_2.6.0)(64bit) \
libz.so.1()(64bit)"

inherit rpm

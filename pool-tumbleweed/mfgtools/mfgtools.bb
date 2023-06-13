SUMMARY = "Freescale/NXP I.MX Chip image deploy tools"
DESCRIPTION = "Freescale/NXP I.MX Chip image deploy tools. This package holds the evolution of MFGTools (aka MFGTools v3), which is called the UUU (Universal Update Utility)."
LICENSE = "BSD-3-Clause"

PV = "1.4.243.7"

RPM_NAME = "mfgtools-1.4.243.7-2.1.aarch64.rpm"
RPM_HASH = "5f83c409871aa0109b2b8bfd156f3b8d0c95a407ce477a3a5ec9a50d70d31373b26f495a32b9bc161ab6f9d74ba790fb661ff9586fcbf2183fe401dd6e86112f"

RPROVIDES:${PN} += "mfgtools \
mfgtools(aarch-64)"

RDEPENDS:${PN} += "libbz2.so.1()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libssl.so.3()(64bit) \
libssl.so.3(OPENSSL_3.0.0)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.5)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.17)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.19)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.22)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.30)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
libusb-1.0.so.0()(64bit) \
libz.so.1()(64bit) \
libz.so.1(ZLIB_1.2.3.5)(64bit) \
libzstd.so.1()(64bit)"

inherit rpm

SUMMARY = "Spell checker library and tool based on HFST"
DESCRIPTION = "Minimal HFST optimized lookup format based spell checker library and \
a demonstrational implementation of command line based spell checker."
LICENSE = "Apache-2.0"

PV = "0.5.1"

RPM_NAME = "hfst-ospell-0.5.1-4.4.aarch64.rpm"
RPM_HASH = "e1c6a386e904eb4538afb28743c4d01bfb9df31da976d9c97eaf649d11d2edf5b6ba93b9110fe14666a3536e551b0902db6608ce277e20f532a6066edf963dbe"

RPROVIDES:${PN} += "hfst-ospell \
hfst-ospell(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libhfstospell.so.11()(64bit) \
libicuuc.so.73()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.1)(64bit) \
libstdc++.so.6(CXXABI_1.3.5)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.18)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.26)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.31)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.32)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm

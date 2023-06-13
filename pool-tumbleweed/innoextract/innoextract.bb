SUMMARY = "A tool to extract Inno Setup installers under non-windows systems"
DESCRIPTION = "Inno Setup is a tool to create installers for Microsoft Windows \
applications. Inno Extracts allows to extract such installers under \
non-windows systems without running the actual installer using wine. Inno \
Extract currently supports installers created by Inno Setup 1.2.10 to \
5.4.3."
LICENSE = "Zlib"

PV = "1.9"

RPM_NAME = "innoextract-1.9-1.21.aarch64.rpm"
RPM_HASH = "5cd1622d938504a931ecadc4297c2761e42bbbfc264880de626c8a26aee592ae132d3e3ba69d082a3c07d4eee7212b1f462d4ef7451d45e0b77d56a92ad2d1b9"

RPROVIDES:${PN} += "innoextract \
innoextract(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libboost_filesystem.so.1.82.0()(64bit) \
libboost_iostreams.so.1.82.0()(64bit) \
libboost_program_options.so.1.82.0()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
liblzma.so.5()(64bit) \
liblzma.so.5(XZ_5.0)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.26)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm

SUMMARY = "Octave functions for reading and writing FITS files"
DESCRIPTION = "Functions for reading and writing FITS (Flexible Image Transport System) files. \
This is part of Octave-Forge project."
LICENSE = "GPL-3.0-or-later"

PV = "1.0.7"

RPM_NAME = "octave-forge-fits-1.0.7-2.23.aarch64.rpm"
RPM_HASH = "77c991fe4f039e82d8821f2070f296f7bfe1dde3e437abf386f242d719fc1940f93bb23d571c259e17ecdcd3ff5052f26e6d1ce42a2a5c95a9e73712743b6630"

RPROVIDES:${PN} += "octave-forge-fits \
octave-forge-fits(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcfitsio.so.10()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
octave-cli"

inherit rpm

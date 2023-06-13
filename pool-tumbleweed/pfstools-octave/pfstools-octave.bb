SUMMARY = "Octave interaction with PFS tools"
DESCRIPTION = "The pfstools-octave package contains programs to process RGB \
or luminance channels in PFS streams using Octave."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.2.0"

RPM_NAME = "pfstools-octave-2.2.0-3.14.aarch64.rpm"
RPM_HASH = "88f260e0a5287cd2064380d616aec19f83868ca069505a4b8cdbe1e56a79ea30d98e23b348092e2035f1611ac110e676769059682f231e2832f795ec664891e8"

RPROVIDES:${PN} += "pfstools-octave \
pfstools-octave(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/octave \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libpfs.so.2()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.1)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
octave"

inherit rpm

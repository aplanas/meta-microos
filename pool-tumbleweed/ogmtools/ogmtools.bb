SUMMARY = "Tools for OGG Media Streams"
DESCRIPTION = "These tools allow information about (ogminfo), extraction from \
(ogmdemux), creation of (ogmmerge), or the division of (ogmsplit) OGG \
media streams.	OGM stands for OGG media streams."
LICENSE = "GPL-2.0-or-later"

PV = "1.5"

RPM_NAME = "ogmtools-1.5-168.7.aarch64.rpm"
RPM_HASH = "967d3343bb93ce6e1a04a7f3e7cc91ae91f4b0691558e27caf0fa3729bccf96b27db27092db08c5819a3df5de006e65fbaab8cf14d68652f477a1eb7baac57ee"

RPROVIDES:${PN} += "ogmtools \
ogmtools(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libdvdread.so.8()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libogg.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.1)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libvorbis.so.0()(64bit) \
libvorbisenc.so.2()(64bit)"

inherit rpm

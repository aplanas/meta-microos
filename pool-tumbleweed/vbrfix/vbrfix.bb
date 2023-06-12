SUMMARY = "Repair MP3 files that have incorrect VBR information"
DESCRIPTION = "Many MP3 decoders estimate the time length of an MP3 file based on \
the filesize divided by the first data packet's bitrate. As songs may \
start with silence and hence a low bitrate packet, this length \
prediction can produce quite nonsensical values, and when jumping \
through a VBR file, 50% through the file is usually not 50% through \
the song. \
 \
vbrfix places a VBR null frame at the beginning of the file to tell \
the MP3 player information about the song length and indexing through \
the song. \
 \
vbrfix can also fix other problems with MP3s, as all non-MP3 content \
is deleted (you can keep tags that you state, though). It can also \
help when merging two VBR MP3s together with a merging tool and then \
needing a newly-calculated VBR null frame."
LICENSE = "GPL-2.0+"

PV = "0.24"

RPM_NAME = "vbrfix-0.24-2.20.aarch64.rpm"
RPM_HASH = "e8a7ce964a4c0e76da02a8eb077d1af7211d81e1649ea8072062705ade892aaf3f1eabda536b6bff943b666a8596e09e21b83fb67705d4d53334b91e7eac673d"

RPROVIDES:${PN} += "vbrfix \
vbrfix(aarch-64) \
vbrfixc"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm

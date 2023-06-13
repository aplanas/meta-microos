SUMMARY = "Speech recognizer library"
DESCRIPTION = "CMU Sphinx toolkit has a number of packages for different tasks and \
applications. Pocketsphinx is a version of the open-source CMU Sphinx \
II speech recognition system which is able to recognize speech in \
real-time."
LICENSE = "BSD-2-Clause"

PV = "0.8"

RPM_NAME = "libpocketsphinx1-0.8-5.15.aarch64.rpm"
RPM_HASH = "2efe5af7e024cc44f36863bead4559115eccd5e568699befc591f78593591cc091ad1d6145dee9f547832b318551044c811ea208a713a339ffb1a3faa696fc53"

RPROVIDES:${PN} += "libpocketsphinx.so.1()(64bit) \
libpocketsphinx1 \
libpocketsphinx1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libsphinxbase.so.1()(64bit)"

inherit rpm

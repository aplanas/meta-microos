SUMMARY = "Speech recognizer library"
DESCRIPTION = "CMU Sphinx toolkit has a number of packages for different tasks and \
applications. Pocketsphinx is a version of the open-source CMU Sphinx \
II speech recognition system which is able to recognize speech in \
real-time."
LICENSE = "BSD-2-Clause"

PV = "0.8"

RPM_NAME = "libpocketsphinx1-0.8-5.16.aarch64.rpm"
RPM_HASH = "16b848cc118293aeee01b3f574a94f68e32f13a539780e756894d24c28255ea8636d830eae51d9ca07a48fcf5e08f4b16b9670689bc23a6fcd21e2846ed4d7d6"

RPROVIDES:${PN} += "libpocketsphinx.so.1 \
libpocketsphinx1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libsphinxbase.so.1"

inherit rpm

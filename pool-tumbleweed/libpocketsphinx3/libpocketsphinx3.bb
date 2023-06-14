SUMMARY = "Speech recognizer library"
DESCRIPTION = "CMU Sphinx toolkit has a number of packages for different tasks and \
applications. Pocketsphinx is a version of the open-source CMU Sphinx \
II speech recognition system which is able to recognize speech in \
real-time."
LICENSE = "BSD-2-Clause"

PV = "5~git20200227.e40da77"

RPM_NAME = "libpocketsphinx3-5~git20200227.e40da77-2.3.aarch64.rpm"
RPM_HASH = "53ac865138aa7c397b6f727cc921de6fb01c4a5deb3b4f63455b96fbfbd96374069839d72a2d616a1a97a4ebf3d863ff23b962cad7cce021de53784a4ee84cc2"

RPROVIDES:${PN} += "libpocketsphinx.so.3 \
libpocketsphinx3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libsphinxbase.so.3 \
pocketsphinx5"

inherit rpm

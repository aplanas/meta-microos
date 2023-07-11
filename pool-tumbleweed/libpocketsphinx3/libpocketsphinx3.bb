SUMMARY = "Speech recognizer library"
DESCRIPTION = "CMU Sphinx toolkit has a number of packages for different tasks and \
applications. Pocketsphinx is a version of the open-source CMU Sphinx \
II speech recognition system which is able to recognize speech in \
real-time."
LICENSE = "BSD-2-Clause"

PV = "5~git20200227.e40da77"

RPM_NAME = "libpocketsphinx3-5~git20200227.e40da77-2.4.aarch64.rpm"
RPM_HASH = "8cc1a6d1cbbfc8af2e4f612bab1cfa69975fbfea1f72dad21561e21e5d94048e083ef9047adfae1f130cf64f53589f09e438ff8dd6c8a88031459f6242ea903b"

RPROVIDES:${PN} += "libpocketsphinx.so.3 \
libpocketsphinx3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libsphinxbase.so.3 \
pocketsphinx5"

inherit rpm

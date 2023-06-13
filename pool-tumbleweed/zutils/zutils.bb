SUMMARY = "Collection of utilities for dealing with compressed files"
DESCRIPTION = "Zutils is a collection of utilities able to deal with any combination \
of compressed and uncompressed files transparently. If any given file, \
including standard input, is compressed, its decompressed content is \
used. Compressed files are decompressed on the fly; no temporary files \
are created. \
These utilities are not wrapper scripts but safer and more efficient \
C++ programs. In particular the '--recursive' option is very efficient \
in those utilities supporting it."
LICENSE = "GPL-2.0-or-later"

PV = "1.12"

RPM_NAME = "zutils-1.12-1.3.aarch64.rpm"
RPM_HASH = "2d625f0fafb596ea776baf3bb1b767395e0973dc98f1ae94bb54fb93466a717288faebed138b2779bd2e162cf3bfb2cd88b60de05ac6bc7a873967dc3bb876b2"

RPROVIDES:${PN} += "zutils \
zutils(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm

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

RPM_NAME = "zutils-1.12-1.4.aarch64.rpm"
RPM_HASH = "fecc91b6c0eed787e7cb45fb0de60ffca739e95753b6e4b3602a1a5e0ee8f7d2560e116d8564cbb8fee827deab10700f003ff57a97a099a0d0cbaef8f186c3c4"

RPROVIDES:${PN} += "zutils"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm

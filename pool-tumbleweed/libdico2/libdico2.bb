SUMMARY = "Shared library for dico"
DESCRIPTION = "GNU Dico is a flexible modular implementation of DICT server (RFC 2229). In \
contrast to another implementations, it does not depend on particular \
database format. GNU Dico handles database accesses using loadable modules. \
 \
This package contains shared library for dico."
LICENSE = "GPL-3.0-or-later"

PV = "2.11"

RPM_NAME = "libdico2-2.11-1.16.aarch64.rpm"
RPM_HASH = "bb10d1b5a123a4a45e62fd98bd4cdadf68275240b840640d6e9337b17047811c6f863cc5635fdba9cd3b7c556041ff6acde374c2a348b4be2b06c41c91cd2097"

RPROVIDES:${PN} += "libdico.so.2 \
libdico2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm

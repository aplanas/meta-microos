SUMMARY = "Tools to work with publications in pre MAC OSX text file-formats"
DESCRIPTION = "Command line tools to work with publications in pre MAC OSX text file-formats."
LICENSE = "GPL-2.0-or-later & (LGPL-2.1-or-later | MPL-2.0)"

PV = "0.3.21"

RPM_NAME = "libmwaw-tools-0.3.21-2.9.aarch64.rpm"
RPM_HASH = "cf6869b852d25872b6b7b8fcb9f9a2f8895d53acb8fbce55dd8cd9ee3b13f5a38a237f27545ab3807e5416a78bbd39ec781f98f64a1cf9275d000a0060d62b01"

RPROVIDES:${PN} += "libmwaw-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libmwaw-0.3.so.3 \
librevenge-0.0.so.0 \
librevenge-generators-0.0.so.0 \
librevenge-stream-0.0.so.0 \
libstdc++.so.6 \
libz.so.1"

inherit rpm

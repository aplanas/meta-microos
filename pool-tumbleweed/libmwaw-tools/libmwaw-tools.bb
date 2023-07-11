SUMMARY = "Tools to work with publications in pre MAC OSX text file-formats"
DESCRIPTION = "Command line tools to work with publications in pre MAC OSX text file-formats."
LICENSE = "GPL-2.0-or-later & (LGPL-2.1-or-later | MPL-2.0)"

PV = "0.3.21"

RPM_NAME = "libmwaw-tools-0.3.21-2.10.aarch64.rpm"
RPM_HASH = "586996ae8638bf998ec9b3e4e17a050118e937fd45b3f71d5c2a4a6b98cc338ef5eab45e72dcc76518a7ded8618d53e99db6441ef96c11dfa40a8945ea30ac74"

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

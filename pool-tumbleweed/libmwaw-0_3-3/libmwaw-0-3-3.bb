SUMMARY = "Pre Mac OSX text file formats parser library"
DESCRIPTION = "Libmwaw is a new project for converting many pre-OSX MAC text formats."
LICENSE = "GPL-2.0-or-later & (LGPL-2.1-or-later | MPL-2.0)"

PV = "0.3.21"

RPM_NAME = "libmwaw-0_3-3-0.3.21-2.9.aarch64.rpm"
RPM_HASH = "b7709730a76ec0cf9b98b48574a96080aaf8651399b6a43d07ebd89884ba42167b766844ae94a06ecb4aa540a2376eaa8184cca456774dd9dc90ac7a99395bf7"

RPROVIDES:${PN} += "libmwaw-0-3-3 \
libmwaw-0.3.so.3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
librevenge-0.0.so.0 \
libstdc++.so.6 \
libz.so.1"

inherit rpm

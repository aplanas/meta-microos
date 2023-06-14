SUMMARY = "Example Applications for the id3lib Library"
DESCRIPTION = "This package contains simple example applications that make use of \
id3lib, a software library for ID3v1 and ID3v2 tag manipulation."
LICENSE = "LGPL-2.1-or-later"

PV = "3.8.3"

RPM_NAME = "id3lib-examples-3.8.3-268.9.aarch64.rpm"
RPM_HASH = "207411100b44529b0b130d6dc3abb29de006b2971540f44ed865f9b2edc695d60b3108c58b9963272bbbd5da54db412a1e6e45a67bdf1042a3bed31a18d1cdad"

RPROVIDES:${PN} += "id3lib-examples"

RDEPENDS:${PN} += "id3lib \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libid3-3.8.so.3 \
libstdc++.so.6"

inherit rpm

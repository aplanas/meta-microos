SUMMARY = "Example Applications for the id3lib Library"
DESCRIPTION = "This package contains simple example applications that make use of \
id3lib, a software library for ID3v1 and ID3v2 tag manipulation."
LICENSE = "LGPL-2.1-or-later"

PV = "3.8.3"

RPM_NAME = "id3lib-examples-3.8.3-268.10.aarch64.rpm"
RPM_HASH = "91bf179987880360f9a75f4d523faddcb0282bc5ebca7eeb92d77f83d2a8b91fed3b712201d16a12b1e450559219926ad0e0aad09e5c4e91bb6be0f1e2fe6a64"

RPROVIDES:${PN} += "id3lib-examples"

RDEPENDS:${PN} += "id3lib \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libid3-3.8.so.3 \
libstdc++.so.6"

inherit rpm

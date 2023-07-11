SUMMARY = "TCTI interface loading library"
DESCRIPTION = "This is a helper library that simplifies loading other tcti libraries. It is \
recommended over custom tcti loading code in applications."
LICENSE = "BSD-2-Clause"

PV = "4.0.1"

RPM_NAME = "libtss2-tctildr0-4.0.1-1.4.aarch64.rpm"
RPM_HASH = "a0dae5a655c1c41d7b7960aa5aa8100e663a4920f9af10f73bd0abf64689050d62230586f21a46050f7ebd1813d59cd40a119b4af66dacdc1b4ae8e487ce720e"

RPROVIDES:${PN} += "libtss2-tctildr.so.0 \
libtss2-tctildr0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm

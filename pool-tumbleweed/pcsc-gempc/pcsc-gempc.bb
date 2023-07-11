SUMMARY = "PCSC driver for the Gemplus GemPC 410/430 smartcard readers"
DESCRIPTION = "This package contains a driver for the GemPC 410 and GemPC 430 smart \
card readers produced by Gemplus. \
 \
This driver is meant to be used with the PCSC-Lite daemon from the \
pcsc-lite package."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later"

PV = "1.0.8"

RPM_NAME = "pcsc-gempc-1.0.8-1.17.aarch64.rpm"
RPM_HASH = "aa3065fec2b7127e66ee98f86ab587e454610e50ce56e4ba41b9e571e7bbf14ee79bb26cc09e622e7ac997a3f32567e982b91cf42a01e2db2b370e653e9ccf74"

RPROVIDES:${PN} += "libGemPC410.so.1.0.8 \
libGemPC430.so.1.0.8 \
pcsc-gempc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libusb-0.1.so.4 \
pcsc-lite"

inherit rpm

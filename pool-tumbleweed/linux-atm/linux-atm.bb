SUMMARY = "Tools for ATM"
DESCRIPTION = "Tools to support ATM (Asynchronous Transfer Mode) networking."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.5.2"

RPM_NAME = "linux-atm-2.5.2-8.8.aarch64.rpm"
RPM_HASH = "62d0a01f23e6cf3483422a8e196621ac357b37a56c8b52332a003974429f6e94f174d4b2e236fa4fe14893ed21d3c5d3fa2f528404cde6a1ca018de76dc9df3a"

RPROVIDES:${PN} += "config-linux-atm \
firmware-pca200e-ecd.bin2 \
firmware-pca200e.bin \
firmware-sba200e-ecd.bin2 \
linux-atm"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libatm.so.1 \
libc.so.6 \
libfl.so.2"

inherit rpm

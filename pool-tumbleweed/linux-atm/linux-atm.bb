SUMMARY = "Tools for ATM"
DESCRIPTION = "Tools to support ATM (Asynchronous Transfer Mode) networking."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.5.2"

RPM_NAME = "linux-atm-2.5.2-8.9.aarch64.rpm"
RPM_HASH = "47f5bd84c32b03f19845165e8cf2626fc37bddc8438c491cb93795299b8c98a12aa83babd321e0c0ea5c7b7b80415629114a3f50bc23b218a19223348d9a8d7b"

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

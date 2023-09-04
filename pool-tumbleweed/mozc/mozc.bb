SUMMARY = "Mozc - Japanese Input Method for Chromium OS, Mac and Linux"
DESCRIPTION = "Mozc is a Japanese Input Method Editor (IME) designed for \
multi-platform such as Chromium OS, Mac and Linux. This open-source \
project originates from Google Japanese Input."
LICENSE = "Apache-2.0 & BSD-3-Clause & SUSE-Public-Domain"

PV = "2.29.5111.102"

RPM_NAME = "mozc-2.29.5111.102-2.1.aarch64.rpm"
RPM_HASH = "08c9475b72d04c6a281cec669b2da62c41330275f2f539948592d5296b1950a9404615009605b4efd32175fc562513e54a843b825f661b807fff0e3c7bc71bab"

RPROVIDES:${PN} += "mozc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libz.so.1"

inherit rpm

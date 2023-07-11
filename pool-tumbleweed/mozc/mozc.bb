SUMMARY = "Mozc - Japanese Input Method for Chromium OS, Mac and Linux"
DESCRIPTION = "Mozc is a Japanese Input Method Editor (IME) designed for \
multi-platform such as Chromium OS, Mac and Linux. This open-source \
project originates from Google Japanese Input."
LICENSE = "Apache-2.0 & BSD-3-Clause & SUSE-Public-Domain"

PV = "2.29.5111.102"

RPM_NAME = "mozc-2.29.5111.102-1.1.aarch64.rpm"
RPM_HASH = "cb415446b85b34f54b52e0bffff5471b80ebac36a893d09515edc531e142b4ba1a97b587d770f6c3cbf25e23c49dfb43519d2316fffb095cde5b92912da565c5"

RPROVIDES:${PN} += "mozc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libz.so.1"

inherit rpm

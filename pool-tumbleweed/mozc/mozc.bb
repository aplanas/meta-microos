SUMMARY = "Mozc - Japanese Input Method for Chromium OS, Mac and Linux"
DESCRIPTION = "Mozc is a Japanese Input Method Editor (IME) designed for \
multi-platform such as Chromium OS, Mac and Linux. This open-source \
project originates from Google Japanese Input."
LICENSE = "Apache-2.0 & BSD-3-Clause & SUSE-Public-Domain"

PV = "2.28.4715.102"

RPM_NAME = "mozc-2.28.4715.102-2.1.aarch64.rpm"
RPM_HASH = "893cebf1c035c83dc7b8067629485b0feb4612e94c83f990100e22a78d6caa0ae1ff69399077d87d8efdcb6b07933016c7a908b23354fc353760ab4e1da57735"

RPROVIDES:${PN} += "mozc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libz.so.1"

inherit rpm

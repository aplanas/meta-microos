SUMMARY = "Fast Light User Interface Designer"
DESCRIPTION = "Fast Light User Interface Designer, an interactive GUI designer for non-ntk."
LICENSE = "GPL-2.0-or-later"

PV = "1.3.1001"

RPM_NAME = "non-ntk-fluid-1.3.1001-1.6.aarch64.rpm"
RPM_HASH = "57c7ffa36886c8ee6758f690a867fabf28b33cb0fbdd5b781321b04f661846f5d37636949912659e8958f088dbd124ab538f9454d59c322c067342cdf2f30ebf"

RPROVIDES:${PN} += "non-ntk-fluid"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libcairo.so.2 \
libgcc-s.so.1 \
libntk-images.so.1 \
libntk.so.1 \
libpng16.so.16 \
libstdc++.so.6 \
non-ntk-devel"

inherit rpm

SUMMARY = "Fast Light User Interface Designer"
DESCRIPTION = "Fast Light User Interface Designer, an interactive GUI designer for non-ntk."
LICENSE = "GPL-2.0-or-later"

PV = "1.3.1001"

RPM_NAME = "non-ntk-fluid-1.3.1001-2.1.aarch64.rpm"
RPM_HASH = "7335124c1623dea7335a51569be8f0922f040ef028c07e20f643e461f6dec9764b212f298bae1b84cba904d2216f096beef4f8edf5a37b9a8a95e8d2de72a01f"

RPROVIDES:${PN} += "non-ntk-fluid"

RDEPENDS:${PN} += "/usr/bin/sh \
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

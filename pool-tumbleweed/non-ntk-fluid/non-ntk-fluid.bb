SUMMARY = "Fast Light User Interface Designer"
DESCRIPTION = "Fast Light User Interface Designer, an interactive GUI designer for non-ntk."
LICENSE = "GPL-2.0-or-later"

PV = "1.3.1001"

RPM_NAME = "non-ntk-fluid-1.3.1001-1.7.aarch64.rpm"
RPM_HASH = "935bab27852d236fa961d54935b9b4036ed7397098da06ab17e3cf1999e514903a9b98b0891bc0509f189562f9ff359f1ec1b4f3e482a4d477f8e5359e8651a9"

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

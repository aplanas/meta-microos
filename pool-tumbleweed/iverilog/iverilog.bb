SUMMARY = "Simulation and synthesis tool for IEEE-1364"
DESCRIPTION = "Icarus Verilog is a Verilog compiler that generates a variety of \
engineering formats, including simulation. It strives to be true \
to the IEEE-1364 standard."
LICENSE = "GPL-2.0-or-later"

PV = "11.0"

RPM_NAME = "iverilog-11.0-1.11.aarch64.rpm"
RPM_HASH = "9e2358c28f8d49692fcec87bb28129530b2a5e0e296336d4e2c5855be187db1c0f8842c74314d1ed560239d5ee298151b6dd6e5aaf4f2609a7d2d282cfe722b2"

RPROVIDES:${PN} += "iverilog"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libreadline.so.8 \
libstdc++.so.6 \
libz.so.1"

inherit rpm

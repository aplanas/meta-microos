SUMMARY = "Simulation and synthesis tool for IEEE-1364"
DESCRIPTION = "Icarus Verilog is a Verilog compiler that generates a variety of \
engineering formats, including simulation. It strives to be true \
to the IEEE-1364 standard."
LICENSE = "GPL-2.0-or-later"

PV = "11.0"

RPM_NAME = "iverilog-11.0-1.12.aarch64.rpm"
RPM_HASH = "5c4f8d81e3839d758cbbe1cd6b1469cdc2cf882e5c0c1edf5220664562c19710d1b11e17af8e50a5ebdf6e00e5f686943049d766d30498f5a9c7431aad20056e"

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

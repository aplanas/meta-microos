SUMMARY = "Signal processing tools for Octave"
DESCRIPTION = "Signal processing tools, including filtering, windowing and display functions. \
This is part of Octave-Forge project."
LICENSE = "GPL-3.0-or-later & SUSE-Public-Domain"

PV = "1.4.3"

RPM_NAME = "octave-forge-signal-1.4.3-1.4.aarch64.rpm"
RPM_HASH = "0190616de466ebcbdc613da162c338faca01a59218ba20d9279f81317a50f88e01940ba97d96f7015e1b779349e4112866d77913a01e3ce9839db694bfbfbed4"

RPROVIDES:${PN} += "octave-forge-signal"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
octave-cli \
octave-forge-control"

inherit rpm

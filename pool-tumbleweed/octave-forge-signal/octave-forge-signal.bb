SUMMARY = "Signal processing tools for Octave"
DESCRIPTION = "Signal processing tools, including filtering, windowing and display functions. \
This is part of Octave-Forge project."
LICENSE = "GPL-3.0-or-later & SUSE-Public-Domain"

PV = "1.4.3"

RPM_NAME = "octave-forge-signal-1.4.3-1.3.aarch64.rpm"
RPM_HASH = "b7b7bc0d7c228c6febd888d75fb12af7cef73d5ac8449f9e090d67daaf370fe0d5bb2146f885b8b4bd79488d0ad5d6f90ab3d4cd3958deefe0a6456085ccef95"

RPROVIDES:${PN} += "octave-forge-signal"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
octave-cli \
octave-forge-control"

inherit rpm

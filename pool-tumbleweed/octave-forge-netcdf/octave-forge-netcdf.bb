SUMMARY = "NetCDF interface for Octave"
DESCRIPTION = "A MATLAB compatible NetCDF interface for Octave. \
This is part of Octave-Forge project."
LICENSE = "GPL-3.0-or-later"

PV = "1.0.16"

RPM_NAME = "octave-forge-netcdf-1.0.16-1.3.aarch64.rpm"
RPM_HASH = "4e7075b2922f7797e2171c890b00a280ba23bbb2e9d9d44b37a6a26cac7e658a26ef693445346cad34832157b5b0f614b1de407353d0f410f0c1798726529ec5"

RPROVIDES:${PN} += "octave-forge-netcdf"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libnetcdf.so.19 \
libstdc++.so.6 \
octave-cli"

inherit rpm

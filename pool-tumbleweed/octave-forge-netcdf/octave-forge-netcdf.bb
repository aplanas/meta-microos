SUMMARY = "NetCDF interface for Octave"
DESCRIPTION = "A MATLAB compatible NetCDF interface for Octave. \
This is part of Octave-Forge project."
LICENSE = "GPL-3.0-or-later"

PV = "1.0.16"

RPM_NAME = "octave-forge-netcdf-1.0.16-1.4.aarch64.rpm"
RPM_HASH = "beca59d7a182c981abcd07d8a3281cab3919f8572aceab1c565e67a78e0d633334a9a05309af0921e3430ac309d6d4b5d70d22c2955a257c83cfd655234cb3ff"

RPROVIDES:${PN} += "octave-forge-netcdf"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libnetcdf.so.19 \
libstdc++.so.6 \
octave-cli"

inherit rpm

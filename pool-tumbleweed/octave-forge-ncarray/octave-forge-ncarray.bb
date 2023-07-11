SUMMARY = "Access to NetCDF files as a multi-dimensional array from Octave"
DESCRIPTION = "Access a single or a collection of NetCDF files as a multi-dimensional array. \
This is part of Octave-Forge project."
LICENSE = "GPL-3.0-or-later"

PV = "1.0.5"

RPM_NAME = "octave-forge-ncarray-1.0.5-1.3.noarch.rpm"
RPM_HASH = "4fd1dc634f1505c5d412a8a025a666ff51ab5a7259e6e1bfa44dfcf15b370d83802c3ccce0f6034474a2b6d067169a0d5c9440b74dd2cd047ce396ae6de7496b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "octave-forge-ncarray"

RDEPENDS:${PN} += "/usr/bin/sh \
octave-cli \
octave-forge-netcdf \
octave-forge-statistics"

inherit rpm

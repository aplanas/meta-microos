SUMMARY = "Access to NetCDF files as a multi-dimensional array from Octave"
DESCRIPTION = "Access a single or a collection of NetCDF files as a multi-dimensional array. \
This is part of Octave-Forge project."
LICENSE = "GPL-3.0-or-later"

PV = "1.0.5"

RPM_NAME = "octave-forge-ncarray-1.0.5-1.2.noarch.rpm"
RPM_HASH = "e987933e3f4431675edd81c814edc596412fbf078d597b80bc3f87e70fca9cd8dc4b9848f535033a960f04b9e0195289896d9403b2b4bb9af58bfe68681495d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "octave-forge-ncarray"
RDEPENDS:${PN} += "/bin/sh \
octave-cli \
octave-forge-netcdf \
octave-forge-statistics"

inherit rpm

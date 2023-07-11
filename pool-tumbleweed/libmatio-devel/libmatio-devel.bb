SUMMARY = "Development files for matio"
DESCRIPTION = "matio is an open-source library for reading and writing MATLAB MAT files. \
This library is designed for use by programs/libraries that do not have \
access or do not want to rely on MATLAB's shared library."
LICENSE = "BSD-2-Clause"

PV = "1.5.23"

RPM_NAME = "libmatio-devel-1.5.23-2.3.aarch64.rpm"
RPM_HASH = "7b1436263ddc0771d2d70d8c3d535b0b69d89fa8b562120668407c098d2d9eedad4f5a48f145aed9e6493a50df83244c0b2e06684e99707c32b8f273189845ea"

RPROVIDES:${PN} += "libmatio-devel \
pkgconfig-matio"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
hdf5-devel \
libmatio11 \
pkgconfig \
zlib-devel"

inherit rpm

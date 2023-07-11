SUMMARY = "Development files for the Osmocom SIM card utility library"
DESCRIPTION = "The libosmosim library in particular contains routines for SIM card \
access. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libosmosim."
LICENSE = "GPL-2.0-or-later"

PV = "1.8.0"

RPM_NAME = "libosmosim-devel-1.8.0-1.2.aarch64.rpm"
RPM_HASH = "8be2351fd1d94c37ab6f3cdf5c415ac21bb4587ca2c2018950b3df63e04e512093dbe79f676151ed943cf3f570532c28c068174b4ef4b790aca347b56221f886"

RPROVIDES:${PN} += "libosmosim-devel \
pkgconfig-libosmosim"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libosmocore-devel \
libosmosim2 \
pkgconfig-libosmocore \
pkgconfig-talloc"

inherit rpm

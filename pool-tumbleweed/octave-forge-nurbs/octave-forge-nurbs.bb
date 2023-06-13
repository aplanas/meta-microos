SUMMARY = "Routines for Non-Uniform Rational B-Splines for Octave"
DESCRIPTION = "Collection of routines for the creation, and manipulation of \
Non-Uniform Rational B-Splines (NURBS). \
This is part of Octave-Forge project."
LICENSE = "GPL-3.0-or-later"

PV = "1.4.3"

RPM_NAME = "octave-forge-nurbs-1.4.3-1.3.aarch64.rpm"
RPM_HASH = "2efe95b30c5fa9d52bc57d61815e1ce8f7a6741c3b30ef6e612f5fa36c59eb119431fce740d8ba63e7a07b05b0d3ac5ab4985dae699abe758d2b9762dd35952c"

RPROVIDES:${PN} += "octave-forge-nurbs \
octave-forge-nurbs(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit) \
octave-cli"

inherit rpm

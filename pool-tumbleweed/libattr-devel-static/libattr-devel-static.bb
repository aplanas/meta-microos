SUMMARY = "Static libraries for libattr development"
DESCRIPTION = "This package contains the static library of libattr which is needed for \
staticallly linking to programs that make use of extended attributes."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.5.1"

RPM_NAME = "libattr-devel-static-2.5.1-1.21.aarch64.rpm"
RPM_HASH = "9efbb2a28198ac5461780277d95bcff11ce587cf064049cfac155aa368794db8a0a52f31d8dc4b5652acaf3e6da55fd9cb68d37dc445d01a029cd502c3ebd950"

RPROVIDES:${PN} += "libattr-devel-/usr/lib64/libattr.a \
libattr-devel-static"

RDEPENDS:${PN} += "libattr-devel"

inherit rpm

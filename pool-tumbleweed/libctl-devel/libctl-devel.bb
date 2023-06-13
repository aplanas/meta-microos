SUMMARY = "Libraries and header files for libctl library"
DESCRIPTION = "libctl is a free Guile-based library implementing flexible control files \
for scientific simulations. It was written to support MIT Photonic Bands \
and Meep software, but has proven useful in other programs too. \
 \
This package contains libraries and header files for developing \
applications that use libctl."
LICENSE = "GPL-2.0-or-later"

PV = "4.5.1"

RPM_NAME = "libctl-devel-4.5.1-1.7.aarch64.rpm"
RPM_HASH = "f2ba7b35578243a49880ffc0e2b3f3687299c9bb48241f1d3c0d06c7dd7ec755d6534e87c07f4162b8cb1613ccb3ca8f9afc6aa4fefe6d6a65894a0fb13850e5"

RPROVIDES:${PN} += "libctl-devel \
libctl-devel(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
libctl7"

inherit rpm

SUMMARY = "Documentation for libctl library"
DESCRIPTION = "libctl is a free Guile-based library implementing flexible control files \
for scientific simulations. It was written to support MIT Photonic Bands \
and Meep software, but has proven useful in other programs too. \
 \
This package contains documentation for libctl library."
LICENSE = "GPL-2.0-or-later"

PV = "4.5.1"

RPM_NAME = "libctl-doc-4.5.1-1.7.aarch64.rpm"
RPM_HASH = "60994a0f82ea53a58b956e3d019f33174403ff088e51d22a2ff9be3a5bcabe6bfc8df5b1f6a04c7f8a3f2daa0268a4c34143b676740d3db5d6f4d56635c57693"

RPROVIDES:${PN} += "libctl-doc"

RDEPENDS:${PN} += ""

inherit rpm

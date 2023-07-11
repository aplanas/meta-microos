SUMMARY = "Documentation for libctl library"
DESCRIPTION = "libctl is a free Guile-based library implementing flexible control files \
for scientific simulations. It was written to support MIT Photonic Bands \
and Meep software, but has proven useful in other programs too. \
 \
This package contains documentation for libctl library."
LICENSE = "GPL-2.0-or-later"

PV = "4.5.1"

RPM_NAME = "libctl-doc-4.5.1-1.8.aarch64.rpm"
RPM_HASH = "363f7e73033c0e6acb3eb605c53edae889b6c20bdbe8934826c82561a79655a539c2ba3b5be09b1529dd6d1acdefaa6f3d3cc2da2dfe436c360bef4c1044d42b"

RPROVIDES:${PN} += "libctl-doc"

RDEPENDS:${PN} += ""

inherit rpm

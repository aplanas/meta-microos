SUMMARY = "Manual for PSPP"
DESCRIPTION = "PSPP is a program for statistical analysis of sampled data. It \
is a free replacement for the proprietary program SPSS. \
 \
This subpackage contains documentation for PSPP."
LICENSE = "GPL-3.0-or-later"

PV = "1.6.2"

RPM_NAME = "pspp-doc-1.6.2-1.1.aarch64.rpm"
RPM_HASH = "86bc4e539511bf892c9dc903f82eac04d987aa5868b3089686b5d9521ef07f72cd536266ec57baf0e9164511d88929375b0714aa086330a23dd84795359e78f9"

RPROVIDES:${PN} += "pspp-doc"

RDEPENDS:${PN} += ""

inherit rpm

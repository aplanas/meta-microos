SUMMARY = "PSPP Developers Guide"
DESCRIPTION = "PSPP is a program for statistical analysis of sampled data. It \
is a free replacement for the proprietary program SPSS. \
 \
This subpackage contains development documentation for PSPP."
LICENSE = "GPL-3.0-or-later"

PV = "1.4.1"

RPM_NAME = "pspp-devel-doc-1.4.1-3.12.aarch64.rpm"
RPM_HASH = "b0cb4685e02a9be034b68d577daf3de738ca6bc022eb5cf36eafb05ef6606ec37873c6e222d67c5c0198f306509f0d39766df9c5ba1dedce071595652a582e46"

RPROVIDES:${PN} += "pspp-devel-doc"

RDEPENDS:${PN} += ""

inherit rpm

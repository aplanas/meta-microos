SUMMARY = "PSPP Developers Guide"
DESCRIPTION = "PSPP is a program for statistical analysis of sampled data. It \
is a free replacement for the proprietary program SPSS. \
 \
This subpackage contains development documentation for PSPP."
LICENSE = "GPL-3.0-or-later"

PV = "1.4.1"

RPM_NAME = "pspp-devel-doc-1.4.1-3.14.aarch64.rpm"
RPM_HASH = "ef6c9cff67813f27e5126b1f86478ec1e9a3921418eefba149b57c77e322d7c5e3d8250539fac2deed41e0e1114ccac6198d7abcb96224c894b80902da3090d5"

RPROVIDES:${PN} += "pspp-devel-doc"

RDEPENDS:${PN} += ""

inherit rpm

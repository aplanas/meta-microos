SUMMARY = "PSPP Developers Guide"
DESCRIPTION = "PSPP is a program for statistical analysis of sampled data. It \
is a free replacement for the proprietary program SPSS. \
 \
This subpackage contains development documentation for PSPP."
LICENSE = "GPL-3.0-or-later"

PV = "1.6.2"

RPM_NAME = "pspp-devel-doc-1.6.2-1.1.aarch64.rpm"
RPM_HASH = "da92c3a711e9373e6f09bb3615ef04d14e36e55816123a6adc4ce7a8a0437930ae5558b817cec4164d0f8d60e16425e15c5edbebd1870d43398de06763509568"

RPROVIDES:${PN} += "pspp-devel-doc"

RDEPENDS:${PN} += ""

inherit rpm

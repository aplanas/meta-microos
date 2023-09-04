SUMMARY = "Perl extension for the C math library, libm"
DESCRIPTION = "This module is a translation of the C _math.h_ file. It exports the \
following selected constants and functions."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "1.00"

RPM_NAME = "perl-Math-Libm-1.00-3.38.aarch64.rpm"
RPM_HASH = "a9262fc1e357743e9cb1e3c0f2718683f5ad011d609f449bfa9bda9d8a1bd6c55f59824f956288ad78b6850fdea0f9f01c2d1b01977f551a1fa8cbbd3389232b"

RPROVIDES:${PN} += "perl-Math--Libm \
perl-Math-Libm"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
perl--MODULE-COMPAT-5.38.0"

inherit rpm

SUMMARY = "Perl extension for the C math library, libm"
DESCRIPTION = "This module is a translation of the C _math.h_ file. It exports the \
following selected constants and functions."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "1.00"

RPM_NAME = "perl-Math-Libm-1.00-3.37.aarch64.rpm"
RPM_HASH = "f50a9e0101680a5168fac9fd4cee05503f44b06e3ebe2637dfd09ca89e96ec22c38b7acc0972abd141d40ff1d7c83569f4e2a1bf2e07d4a87e5f7b95e4721e29"

RPROVIDES:${PN} += "perl-Math--Libm \
perl-Math-Libm"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
perl--MODULE-COMPAT-5.36.1"

inherit rpm

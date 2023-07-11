SUMMARY = "Elliptic Curve Method for Integer Factorization"
DESCRIPTION = "GMP-ECM reads the numbers to be factored from stdin (one number on each \
line) and requires a numerical parameter, the stage 1 bound B1. A reasonable \
stage 2 bound B2 for the given B1 is chosen by default, but can be overridden \
by a second numerical parameter. By default, GMP-ECM uses the ECM factoring \
algorithm."
LICENSE = "GPL-3.0-only"

PV = "7.0.5"

RPM_NAME = "gmp-ecm-7.0.5-1.4.aarch64.rpm"
RPM_HASH = "7c8c030b6a58f09b33aa13eac494d15062c6f8005f7c87304dd470532e9189e262022366beb3f92098ee7bf7aa9d32408f82981fcd783a52bf07bdaeea7cc61c"

RPROVIDES:${PN} += "gmp-ecm"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libecm.so.1 \
libgmp.so.10 \
libm.so.6"

inherit rpm

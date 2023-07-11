SUMMARY = "A computer algebra system for solving problems in field theory"
DESCRIPTION = "Cadabra2 is a computer algebra system (CAS) designed specifically for \
the solution of problems encountered in field theory. \
 \
This package provides examples for cadabra2."
LICENSE = "GPL-3.0-or-later"

PV = "2.4.3.2"

RPM_NAME = "cadabra2-examples-2.4.3.2-1.6.aarch64.rpm"
RPM_HASH = "bab867fc76255e8007e9437db0852459df4bce1751a88e2b3b3c1e89c582d2841a943f915c787ae6a6370d41873400ddc1dc7d4924e06a5d9b055f0e0cdbdab5"

RPROVIDES:${PN} += "cadabra2-examples"

RDEPENDS:${PN} += "cadabra2"

inherit rpm

SUMMARY = "A computer algebra system for solving problems in field theory"
DESCRIPTION = "Cadabra2 is a computer algebra system (CAS) designed specifically for \
the solution of problems encountered in field theory. \
 \
This package provides examples for cadabra2."
LICENSE = "GPL-3.0-or-later"

PV = "2.4.3.2"

RPM_NAME = "cadabra2-examples-2.4.3.2-1.5.aarch64.rpm"
RPM_HASH = "bb48afbdb1f46656392322c8fafe701711452f55a37271a93c5f5a560ca1435a9a3b5cade7c51902aa2c644d062c0acb2bf2ef6c473f2d88e6b1953ef21e9947"

RPROVIDES:${PN} += "cadabra2-examples \
cadabra2-examples(aarch-64)"
RDEPENDS:${PN} += "cadabra2"

inherit rpm

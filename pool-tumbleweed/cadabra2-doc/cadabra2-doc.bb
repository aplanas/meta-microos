SUMMARY = "A computer algebra system for solving problems in field theory"
DESCRIPTION = "Cadabra2 is a computer algebra system (CAS) designed specifically for \
the solution of problems encountered in field theory. \
 \
This package provides html documentation for cadabra2."
LICENSE = "GPL-3.0-or-later"

PV = "2.4.3.2"

RPM_NAME = "cadabra2-doc-2.4.3.2-1.5.aarch64.rpm"
RPM_HASH = "b4b90118f825be5348937609a3f150ef49adebe74f5c07cac9fd52c7c9ba0608f835c650771729496c86190dd8c853f501fba16aa43e895f61a1523f62acbd34"

RPROVIDES:${PN} += "cadabra-doc \
cadabra2-doc \
cadabra2-doc(aarch-64)"

RDEPENDS:${PN} += ""

inherit rpm

SUMMARY = "A computer algebra system for solving problems in field theory"
DESCRIPTION = "Cadabra2 is a computer algebra system (CAS) designed specifically for \
the solution of problems encountered in field theory. \
 \
This package provides html documentation for cadabra2."
LICENSE = "GPL-3.0-or-later"

PV = "2.4.3.2"

RPM_NAME = "cadabra2-doc-2.4.3.2-1.6.aarch64.rpm"
RPM_HASH = "0e97eea4709585a4d71538b3f309513ca900e5e0fc6cd8b9a81b7a36e969ed6a519aca65f3f0ebbe5e3125e64e3aeb1f4b4ccf18f691357a44819aed5a1f9536"

RPROVIDES:${PN} += "cadabra-doc \
cadabra2-doc"

RDEPENDS:${PN} += ""

inherit rpm

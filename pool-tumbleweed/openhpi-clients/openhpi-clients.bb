SUMMARY = "HPI Command-line Applications"
DESCRIPTION = "This package contains HPI command-line utilities \
 \
OpenHPI implements the SA Forum's Hardware Platform Interface (HPI). HPI is an \
abstracted interface for managing computer hardware, typically for chassis and \
rack based servers."
LICENSE = "BSD-3-Clause"

PV = "3.8.0.ge4631e8a"

RPM_NAME = "openhpi-clients-3.8.0.ge4631e8a-3.5.aarch64.rpm"
RPM_HASH = "736a5dc022a5783d635c984f6db89943e7775d6d86df69322ae83685063d894a3c50899e10844b9e8818319140dd878a34a1818c949c5a9d8d32e90360a7c72e"

RPROVIDES:${PN} += "openhpi-clients"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libopenhpi.so.4 \
libopenhpiutils.so.4 \
libstdc++.so.6 \
openhpi"

inherit rpm

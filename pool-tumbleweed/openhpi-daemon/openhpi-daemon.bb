SUMMARY = "Implementation of SA Forum's Hardware Platform Interface (HPI)"
DESCRIPTION = "OpenHPI implements the SA Forum's Hardware Platform Interface (HPI). HPI is an \
abstracted interface for managing computer hardware, typically for chassis and \
rack based servers."
LICENSE = "BSD-3-Clause"

PV = "3.8.0.ge4631e8a"

RPM_NAME = "openhpi-daemon-3.8.0.ge4631e8a-3.5.aarch64.rpm"
RPM_HASH = "df454a41ee7c508e528bc9bd97d96d16769adff3c29cfe235eaf0d9e12036087c7aa11272a09e388f92c68c93fd9e6d71456424f2456223dd8c8b1f9abdc2b21"

RPROVIDES:${PN} += "openhpi-daemon"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libopenhpi-ssl.so.4 \
libopenhpimarshal.so.4 \
libopenhpitransport.so.4 \
libopenhpiutils.so.4 \
libstdc++.so.6 \
openhpi \
systemd"

inherit rpm

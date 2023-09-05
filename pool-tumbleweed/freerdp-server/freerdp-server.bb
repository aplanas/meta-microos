SUMMARY = "Remote Desktop Server"
DESCRIPTION = "This package contains a server-side implementation which can export a desktop \
via the Remote Desktop Protocol (RDP) following the Microsoft Open \
Specifications."
LICENSE = "Apache-2.0"

PV = "2.11.0"

RPM_NAME = "freerdp-server-2.11.0-1.1.aarch64.rpm"
RPM_HASH = "023412367dc47432f6910ab4687789f95ecd2a12c874eb93b2c180a0095c78f13150955248c3ed24b006b0c33b1e745658ae3ad13c581037d3e789d38dad2639"

RPROVIDES:${PN} += "freerdp-server"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfreerdp-shadow-subsystem2.so.2 \
libfreerdp-shadow2.so.2 \
libwinpr-tools2.so.2 \
libwinpr2.so.2"

inherit rpm

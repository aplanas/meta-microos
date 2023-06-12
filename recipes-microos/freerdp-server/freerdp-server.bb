SUMMARY = "Remote Desktop Server"
DESCRIPTION = "This package contains a server-side implementation which can export a desktop \
via the Remote Desktop Protocol (RDP) following the Microsoft Open \
Specifications."
LICENSE = "Apache-2.0"

PV = "2.10.0"

RPM_NAME = "freerdp-server-2.10.0-3.1.aarch64.rpm"
RPM_HASH = "af004c5ccc7f288805c2fc617fdc3765509c1e06ad295bebc71c09a2528cf2e93f5452351977369822145a2282d02034b2ad1cd95bf66d79aeffcb5502fb4742"

RPROVIDES:${PN} += "freerdp-server \
freerdp-server(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libfreerdp-shadow-subsystem2.so.2()(64bit) \
libfreerdp-shadow2.so.2()(64bit) \
libwinpr-tools2.so.2()(64bit) \
libwinpr2.so.2()(64bit)"

inherit rpm

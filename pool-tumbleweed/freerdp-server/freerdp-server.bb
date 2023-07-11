SUMMARY = "Remote Desktop Server"
DESCRIPTION = "This package contains a server-side implementation which can export a desktop \
via the Remote Desktop Protocol (RDP) following the Microsoft Open \
Specifications."
LICENSE = "Apache-2.0"

PV = "2.10.0"

RPM_NAME = "freerdp-server-2.10.0-3.2.aarch64.rpm"
RPM_HASH = "31cafe00057187c58bd3f27aeceb65eaf9c0d62388e303e61514b1191cc95b6f3e3abc7466bfb3a4e2725d635af290b8b7a1bd65db8bcf10c6538997781e3561"

RPROVIDES:${PN} += "freerdp-server"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfreerdp-shadow-subsystem2.so.2 \
libfreerdp-shadow2.so.2 \
libwinpr-tools2.so.2 \
libwinpr2.so.2"

inherit rpm

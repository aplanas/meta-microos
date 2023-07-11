SUMMARY = "Remote Desktop Security and Monitorig Proxy Server"
DESCRIPTION = "This package contains a proxy that allows to select specific features and \
channels allowed for all connections passing through. \
It allows monitoring of the running sessions."
LICENSE = "Apache-2.0"

PV = "2.10.0"

RPM_NAME = "freerdp-proxy-2.10.0-3.2.aarch64.rpm"
RPM_HASH = "13ad3cfe5a9d2a5de7d68d961fa2ec73fb131cf939a2a37cee149a312b3bcb13632f3669c884f83b921a0f172aa87d75e666642931babc21e5f042cb7138b028"

RPROVIDES:${PN} += "freerdp-proxy"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfreerdp-client2.so.2 \
libfreerdp-server2.so.2 \
libfreerdp2.so.2 \
librdpgfx-client.so \
libwinpr2.so.2"

inherit rpm

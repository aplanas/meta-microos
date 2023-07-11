SUMMARY = "Ulfius WebSocket Client"
DESCRIPTION = "A simple command-line websocket client program."
LICENSE = "MIT"

PV = "2.7.12"

RPM_NAME = "uwsc-2.7.12-1.4.aarch64.rpm"
RPM_HASH = "cedee75e732f59017747b4b4567d397b906077bda7cbf4c166100d426adef9ff40e011b088dc10c0d30a6f46fd43acecc4920a6ef91c657b1d138bb326610147"

RPROVIDES:${PN} += "uwsc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
liborcania.so.2.3 \
libulfius.so.2.7 \
libyder.so.1.4"

inherit rpm

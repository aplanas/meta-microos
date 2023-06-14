SUMMARY = "Ulfius WebSocket Client"
DESCRIPTION = "A simple command-line websocket client program."
LICENSE = "MIT"

PV = "2.7.12"

RPM_NAME = "uwsc-2.7.12-1.3.aarch64.rpm"
RPM_HASH = "c239c9836973586488919981d926c54596e164d83d47fad217fc2663685d14ceffe41128bb9d57f28ab89417469801452b9cefba977bf233d12436cafe7acddf"

RPROVIDES:${PN} += "uwsc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
liborcania.so.2.3 \
libulfius.so.2.7 \
libyder.so.1.4"

inherit rpm

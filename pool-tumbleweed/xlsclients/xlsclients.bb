SUMMARY = "Utility to list client applications running on a X11 server"
DESCRIPTION = "xlsclients is a utility for listing information about the client \
applications running on a X11 server."
LICENSE = "X11"

PV = "1.1.5"

RPM_NAME = "xlsclients-1.1.5-1.2.aarch64.rpm"
RPM_HASH = "4c5565936ae2354cccd46ccb37a19fd2b83378dbd5e5f30390ec62bd19a0baa9198259ffaeebbb7883e67dc347b009d75a0efc616b160ecf76949b5ec3688ff3"

RPROVIDES:${PN} += "xlsclients"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libxcb.so.1"

inherit rpm

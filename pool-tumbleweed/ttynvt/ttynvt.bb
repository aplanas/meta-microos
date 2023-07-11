SUMMARY = "Virtual Network Terminal supporting the Com Port Control Option (RFC2217)"
DESCRIPTION = "ttynvt makes a virtual serial device (tty) and connects \
the device to a Network Virtual Terminal (NVT)."
LICENSE = "GPL-3.0-or-later"

PV = "0.16"

RPM_NAME = "ttynvt-0.16-1.2.aarch64.rpm"
RPM_HASH = "602cdaff279d2e6cee9f969dca1abeb94e65010089b758ea7ce6eba561e3974b9d9fdef891e4d7c33702c5216943a02c60dae575b6727725dd2c34522f66154a"

RPROVIDES:${PN} += "ttynvt"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfuse.so.2"

inherit rpm

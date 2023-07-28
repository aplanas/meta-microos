SUMMARY = "Utility to manage outputs of a Wayland compositor"
DESCRIPTION = "wlr-randr is a command line utility to manage outputs of a Wayland compositor."
LICENSE = "MIT"

PV = "0.3.0"

RPM_NAME = "wlr-randr-0.3.0-1.1.aarch64.rpm"
RPM_HASH = "c6b1541e66c3960aa1177211f141ebdbf58856ace93c235d179191c2d92098804c83cdbcfd60179d53ac5f69bc500ff189a46a0b32fae7cdeb7bcf49566547a3"

RPROVIDES:${PN} += "wlr-randr"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libwayland-client.so.0"

inherit rpm

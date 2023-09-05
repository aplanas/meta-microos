SUMMARY = "User-space driver for Mellanox BlueField SoC"
DESCRIPTION = "This is the user-space driver to access the BlueField SoC via the rshim \
interface. It provides ways to push boot stream, debug the target or login \
via the virtual console or network interface."
LICENSE = "GPL-2.0 | BSD-3-Clause"

PV = "2.0.9.0"

RPM_NAME = "rshim-2.0.9.0-1.1.aarch64.rpm"
RPM_HASH = "5a20e381bea0c6e7162c98fbc8b9f883eee8c12a868ab90ae6345e41700cc4999b48127fd3169183a04d3e93946972a95f6226f779a086792597005dd69b07a9"

RPROVIDES:${PN} += "rshim"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfuse.so.2 \
libpci.so.3 \
libusb-1.0.so.0"

inherit rpm

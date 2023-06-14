SUMMARY = "Displays warning and error messages in sway"
DESCRIPTION = "Displays warning and error messages in sway."
LICENSE = "MIT"

PV = "1.8.1"

RPM_NAME = "swaynag-1.8.1-2.1.aarch64.rpm"
RPM_HASH = "4b17ee2100279b05eb78e69a68979fa61b1d2a5645499fe9ffaffc0345cec67aed88361fbe34bce21126e073afa2257f1d5c30837feea029c9018a0bb4e834f3"

RPROVIDES:${PN} += "swaynag"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libwayland-client.so.0 \
libwayland-cursor.so.0 \
sway"

inherit rpm

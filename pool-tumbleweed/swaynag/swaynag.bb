SUMMARY = "Displays warning and error messages in sway"
DESCRIPTION = "Displays warning and error messages in sway."
LICENSE = "MIT"

PV = "1.8.1"

RPM_NAME = "swaynag-1.8.1-2.1.aarch64.rpm"
RPM_HASH = "4b17ee2100279b05eb78e69a68979fa61b1d2a5645499fe9ffaffc0345cec67aed88361fbe34bce21126e073afa2257f1d5c30837feea029c9018a0bb4e834f3"

RPROVIDES:${PN} += "swaynag \
swaynag(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcairo.so.2()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libpango-1.0.so.0()(64bit) \
libpangocairo-1.0.so.0()(64bit) \
libwayland-client.so.0()(64bit) \
libwayland-cursor.so.0()(64bit) \
sway"

inherit rpm

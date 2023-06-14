SUMMARY = "The 3D Athena Widget Set"
DESCRIPTION = "Xaw3d is a general-purpose replacement for the Athena toolkit which \
adds a 3D appearance and support for XPM images."
LICENSE = "MIT"

PV = "1.6.4"

RPM_NAME = "libXaw3d8-1.6.4-1.3.aarch64.rpm"
RPM_HASH = "661a7dcfc93c23f45255a8fcc3026a97d738ba9136113a24c6ce63b719bf288864f2c5bb4fdf3587ae12c12eb5c39fdcfab4d65a56d08900686ff1fed9c2e81d"

RPROVIDES:${PN} += "Xaw3d \
libXaw3d.so.8 \
libXaw3d8 \
xaw3d"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXext.so.6 \
libXmu.so.6 \
libXpm.so.4 \
libXt.so.6 \
libc.so.6"

inherit rpm

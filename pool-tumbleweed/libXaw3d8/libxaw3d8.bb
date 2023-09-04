SUMMARY = "The 3D Athena Widget Set"
DESCRIPTION = "Xaw3d is a general-purpose replacement for the Athena toolkit which \
adds a 3D appearance and support for XPM images."
LICENSE = "MIT"

PV = "1.6.5"

RPM_NAME = "libXaw3d8-1.6.5-1.1.aarch64.rpm"
RPM_HASH = "a6ea1d24bc3f2ff024a357467fdae72cb2279c15b441ddc885f3215459115c867e9d4315ac1ea6e5424a6fb7dc7ad84cca02bc902e5be5e20d88779e74f752bf"

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

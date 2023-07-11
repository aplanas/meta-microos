SUMMARY = "The 3D Athena Widget Set"
DESCRIPTION = "Xaw3d is a general-purpose replacement for the Athena toolkit which \
adds a 3D appearance and support for XPM images."
LICENSE = "MIT"

PV = "1.6.4"

RPM_NAME = "libXaw3d7-1.6.4-1.4.aarch64.rpm"
RPM_HASH = "584b23726811dcd53db801dc7f4aa758e9d5982a9245df37127f40188bc729253bc6ceb7f8ea43ee440354edd665357f510cd200553754265c92b0eedf9dc4af"

RPROVIDES:${PN} += "libXaw3d.so.7 \
libXaw3d7"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXext.so.6 \
libXmu.so.6 \
libXpm.so.4 \
libXt.so.6 \
libc.so.6"

inherit rpm

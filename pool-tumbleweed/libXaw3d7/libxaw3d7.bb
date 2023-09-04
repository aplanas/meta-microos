SUMMARY = "The 3D Athena Widget Set"
DESCRIPTION = "Xaw3d is a general-purpose replacement for the Athena toolkit which \
adds a 3D appearance and support for XPM images."
LICENSE = "MIT"

PV = "1.6.5"

RPM_NAME = "libXaw3d7-1.6.5-1.1.aarch64.rpm"
RPM_HASH = "a36fc50a88c13a0a798e8b807a3c6b4f2368d19db7056d5b679d8c49aea2fee5202d6a4a58ae063a5a15295a5b1eb5d30b71e9f024d2a4277b394c202c1100de"

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

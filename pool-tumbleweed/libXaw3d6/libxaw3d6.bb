SUMMARY = "The 3D Athena Widget Set"
DESCRIPTION = "Xaw3d is a general-purpose replacement for the Athena toolkit which \
adds a 3D appearance and support for XPM images."
LICENSE = "MIT"

PV = "1.6.5"

RPM_NAME = "libXaw3d6-1.6.5-1.1.aarch64.rpm"
RPM_HASH = "1b4544a6240574595a0bfed723fedbe58df962b63ae49b6093ab176c601f2a72e96d8bb04d83365b987a8554f40f90fbf2df5c27f080d19d7ec64e6f43a04edb"

RPROVIDES:${PN} += "libXaw3d.so.6 \
libXaw3d6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXext.so.6 \
libXmu.so.6 \
libXpm.so.4 \
libXt.so.6 \
libc.so.6"

inherit rpm

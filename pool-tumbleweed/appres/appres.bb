SUMMARY = "Utility to list the resource database of an X application"
DESCRIPTION = "The appres program prints the resources seen by an application (or \
subhierarchy of an application) with the specified class and instance \
names. It can be used to determine which resources a particular \
program will load."
LICENSE = "X11"

PV = "1.0.6"

RPM_NAME = "appres-1.0.6-1.7.aarch64.rpm"
RPM_HASH = "eb758ef2d7d0aeae410bde8a92be0d8d9e872dacd9fa00536cb16376e3cd3e57981a99e5dc201547b34714f4631408b0c94c3d928a2dbc605adeeea00a92f9a0"

RPROVIDES:${PN} += "appres"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXt.so.6 \
libc.so.6"

inherit rpm

SUMMARY = "Applets for the Enlightenment DR16 Window Manager"
DESCRIPTION = "Epplets are programs designed to work with the Enlightenment Window \
Manager Version 0.16.  Generally they are quite small and \
provide a quick way for a user to perform simple tasks or view \
information."
LICENSE = "GPL-2.0-or-later"

PV = "0.10"

RPM_NAME = "epplet-base-0.10-78.13.aarch64.rpm"
RPM_HASH = "9ef57593afa4fb50ead21cf74a51f3a3d31535e91160cab6a3b4a3d5471fca1af450f6467a08d0462b8f2a0862f667d418ac5c87dde595c7e5558e02bcd5fcd8"

RPROVIDES:${PN} += "epplet-base \
libepplet.so.2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libGL.so.1 \
libImlib2.so.1 \
libX11.so.6 \
libc.so.6 \
libm.so.6"

inherit rpm

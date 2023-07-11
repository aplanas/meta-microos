SUMMARY = "Dynamic library to access the UDisksd daemon"
DESCRIPTION = "This package contains the dynamic library, which provides \
access to the UDisksd daemon."
LICENSE = "LGPL-2.0-or-later"

PV = "2.9.4"

RPM_NAME = "libudisks2-0-2.9.4-6.4.aarch64.rpm"
RPM_HASH = "2129af31de1b1f4cf52c2b25e2b0396724db26c6c1ef9909c8b26015d2bcdd4b8824021fa2477661843734015d867e9a636bb7bbc1d0f2a3cb4a229b125dec89"

RPROVIDES:${PN} += "libudisks2-0 \
libudisks2.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm

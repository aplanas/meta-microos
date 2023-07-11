SUMMARY = "The core library for lightmediascanner"
DESCRIPTION = "Lightweight media scanner. \
 \
This package contains the shared library."
LICENSE = "LGPL-2.1"

PV = "0.5.2"

RPM_NAME = "liblightmediascanner0-0.5.2-2.5.aarch64.rpm"
RPM_HASH = "877b860f51af6d0b6beb6a3e545c65bb2f62ded5b5e43c04acd65ad568678bf1df5fdf92de703df4a42789371b079c8bea1536ae0d80c9d8d2073bd39c91ebc3"

RPROVIDES:${PN} += "liblightmediascanner.so.0 \
liblightmediascanner0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libmagic.so.1 \
libsqlite3.so.0"

inherit rpm

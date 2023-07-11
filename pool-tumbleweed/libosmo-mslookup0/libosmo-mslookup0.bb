SUMMARY = "Osmocom MS lookup library"
DESCRIPTION = "This shared library contains routines for looking up mobile subscribers."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.0"

RPM_NAME = "libosmo-mslookup0-1.4.0-1.12.aarch64.rpm"
RPM_HASH = "3cfff0c6426c004a3d5bbfa22d8d1f9be6c27539ada6a9b404998e9ce70b20be26e57aeb62798298a6d79f277a2d2019a1428aab71cc3916d4a2954e26691a90"

RPROVIDES:${PN} += "libosmo-mslookup.so.0 \
libosmo-mslookup0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libosmocore.so.20 \
libosmogsm.so.18 \
libtalloc.so.2"

inherit rpm

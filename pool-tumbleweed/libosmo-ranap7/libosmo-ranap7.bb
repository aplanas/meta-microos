SUMMARY = "Radio Access Network Application Part library"
DESCRIPTION = "Osmocom code for the Radio Access Network Application Part of the Iu-h \
interface."
LICENSE = "AGPL-3.0-or-later & GPL-2.0-or-later"

PV = "1.4.0"

RPM_NAME = "libosmo-ranap7-1.4.0-1.1.aarch64.rpm"
RPM_HASH = "32d78680cb0e27df277faa5626621684856f8f4e906fe8671ffaa48457412a8dc9c4d5b69d7234996fed251e8a4a92d15e8854edf85edc06db0df9417f72ebe6"

RPROVIDES:${PN} += "libosmo-ranap.so.7 \
libosmo-ranap7"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libasn1c.so.1 \
libc.so.6 \
libosmo-sigtran.so.7 \
libosmocore.so.20 \
libosmogsm.so.18 \
libosmovty.so.9 \
libtalloc.so.2"

inherit rpm

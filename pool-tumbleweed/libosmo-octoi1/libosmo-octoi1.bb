SUMMARY = "Library for the Osmocom Community TDMoIP network"
DESCRIPTION = "Library for the Osmocom Community TDMoIP network."
LICENSE = "LGPL-3.0-or-later"

PV = "0.5.0"

RPM_NAME = "libosmo-octoi1-0.5.0-1.2.aarch64.rpm"
RPM_HASH = "b10ee0462ae5683a63e308a69ff7c77c0fe6071e4bdee43f47c9467a88de3f8353dba70dfb99be82f8182741a8ef5eea95890750804176a66613e33eff7aed78"

RPROVIDES:${PN} += "libosmo-octoi.so.1 \
libosmo-octoi1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libosmocore.so.20 \
libosmovty.so.9 \
libtalloc.so.2"

inherit rpm

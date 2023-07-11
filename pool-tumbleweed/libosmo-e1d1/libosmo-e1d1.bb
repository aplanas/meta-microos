SUMMARY = "Osmocom E1 daemon protocol library"
DESCRIPTION = "Osmocom E1 Daemon Protocol Library."
LICENSE = "LGPL-3.0-or-later"

PV = "0.5.0"

RPM_NAME = "libosmo-e1d1-0.5.0-1.2.aarch64.rpm"
RPM_HASH = "f40e7e9246128306a65bb5a208ef743565a65e71375fe51f13fe97a8c3b84704b48cb4b3b547e92ff592273a84e759396e69905af2ec0319dc7863efc24f40a8"

RPROVIDES:${PN} += "libosmo-e1d.so.1 \
libosmo-e1d1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libosmocore.so.20 \
libtalloc.so.2"

inherit rpm

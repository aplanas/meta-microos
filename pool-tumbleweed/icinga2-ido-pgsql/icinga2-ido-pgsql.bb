SUMMARY = "IDO PostgreSQL database backend for Icinga 2"
DESCRIPTION = "Icinga 2 IDO PostgreSQL database backend. Compatible with Icinga 1.x \
IDOUtils schema >= 1.12"
LICENSE = "GPL-2.0-or-later"

PV = "2.13.7"

RPM_NAME = "icinga2-ido-pgsql-2.13.7-1.4.aarch64.rpm"
RPM_HASH = "55a94bc93cb5b1b3e78930b018f3d3ee7b2aa1e9ce5785aea16f08c567bd6a5721c80c90c28d482edb0d0172a609b3faac4a2ba50044daba7914a4479bb0afdc"

RPROVIDES:${PN} += "config(icinga2-ido-pgsql) \
icinga2-ido-pgsql \
icinga2-ido-pgsql(aarch-64) \
libpgsql_shim.so.2.13.7()(64bit)"

RDEPENDS:${PN} += "/bin/sh \
icinga2-bin \
libpq.so.5()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm

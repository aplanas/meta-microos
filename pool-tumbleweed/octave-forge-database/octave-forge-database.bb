SUMMARY = "Octave plugin interfacing PostgreSQL"
DESCRIPTION = "Interface to PostgreSQL databases. \
This is part of Octave-Forge project."
LICENSE = "GPL-3.0-or-later"

PV = "2.4.4"

RPM_NAME = "octave-forge-database-2.4.4-3.1.aarch64.rpm"
RPM_HASH = "c5255c834374ee70aa040efcd3be359dd880de7beb3eed2233dd275ed866c59f311ddd542270bcf926cc02ad041293b6b826e4e008fe491d860c5ca4897d4f86"

RPROVIDES:${PN} += "octave-forge-database \
octave-forge-database(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libpq.so.5()(64bit) \
libstdc++.so.6()(64bit) \
octave-cli \
octave-forge-struct"

inherit rpm

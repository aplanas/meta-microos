SUMMARY = "Octave plugin interfacing PostgreSQL"
DESCRIPTION = "Interface to PostgreSQL databases. \
This is part of Octave-Forge project."
LICENSE = "GPL-3.0-or-later"

PV = "2.4.4"

RPM_NAME = "octave-forge-database-2.4.4-3.2.aarch64.rpm"
RPM_HASH = "9404d3fee23a4867a955cc3a96c4481c938f6f663e2e7598a36d9a8b3ccaece7104f9ea17b1ade07957397bca0e899b6da9a82426b0718c6688cc664250474e0"

RPROVIDES:${PN} += "octave-forge-database"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libpq.so.5 \
libstdc++.so.6 \
octave-cli \
octave-forge-struct"

inherit rpm

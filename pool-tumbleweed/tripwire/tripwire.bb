SUMMARY = "A tool to observe the filesystem"
DESCRIPTION = "By using tripwire, it is possible to observe the filesystem. tripwire \
generates a database, controlled by a configuration file, of all \
files, their checksums, etc. and it reports changes."
LICENSE = "GPL-2.0-or-later"

PV = "2.4.3.7"

RPM_NAME = "tripwire-2.4.3.7-1.8.aarch64.rpm"
RPM_HASH = "df19b4c9275424ad15b44844a61d01696c71480e4f589797ca236b93f635ed00e5d977698a469c08e188580d089e6241902b8b347b63920953b945785d3dbada"

RPROVIDES:${PN} += "Tripwire \
config-tripwire \
tripwire"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm

SUMMARY = "File Archivier"
DESCRIPTION = "This package contains the 7z command line utility for archiving and \
extracting various formats."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later & SUSE-Public-Domain"

PV = "23.01"

RPM_NAME = "7zip-23.01-1.1.aarch64.rpm"
RPM_HASH = "98a64e4759ff29d801c68ef14f969e5fa0b8d90884bb288ce5c7e7cd8dc7bb30cd01413b25e7c4eaa4063db22cab7c08d2e8462887fd8d1d4f23f41bd58c8784"

RPROVIDES:${PN} += "7zip \
p7zip \
p7zip-full"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm

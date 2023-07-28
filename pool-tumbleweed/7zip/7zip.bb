SUMMARY = "File Archivier"
DESCRIPTION = "This package contains the 7z command line utility for archiving and \
extracting various formats."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later & SUSE-Public-Domain"

PV = "23.01"

RPM_NAME = "7zip-23.01-2.1.aarch64.rpm"
RPM_HASH = "12aea513bf6905bad404d63573244199463b3c552e59c4779a8ce0243ba8f2663657fe386bb8d52095d62575c062f6d893386035ccf908d1efd151ef8f90abb7"

RPROVIDES:${PN} += "7zip \
p7zip \
p7zip-full"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm

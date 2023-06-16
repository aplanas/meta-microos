SUMMARY = "File Archivier"
DESCRIPTION = "This package contains the 7z command line utility for archiving and \
extracting various formats."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later & SUSE-Public-Domain"

PV = "22.01"

RPM_NAME = "7zip-22.01-3.3.aarch64.rpm"
RPM_HASH = "625d3ce2024dac8859a4342866d645bb67da13fcc30d8e5bafb4f02e97e547ed41ead3277119f28a08b85302902b3c7c0d0e8f0a85a901f70b82dd06a60e9e3b"

RPROVIDES:${PN} += "7zip \
p7zip \
p7zip-full"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm

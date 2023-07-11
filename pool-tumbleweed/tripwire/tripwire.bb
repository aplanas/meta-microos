SUMMARY = "A tool to observe the filesystem"
DESCRIPTION = "By using tripwire, it is possible to observe the filesystem. tripwire \
generates a database, controlled by a configuration file, of all \
files, their checksums, etc. and it reports changes."
LICENSE = "GPL-2.0-or-later"

PV = "2.4.3.7"

RPM_NAME = "tripwire-2.4.3.7-1.9.aarch64.rpm"
RPM_HASH = "4b508262fc2db8f42ef8affa4463601f38cc21d2c21f8934f9b037fcdf6aaa9b08ea8f8a01f42c76d952648a0b66e24622bc9d732913402ce0b487e2ff998d34"

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

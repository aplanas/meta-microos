SUMMARY = "Tool to identify or delete duplicate files"
DESCRIPTION = "FDUPES is a program for identifying or deleting duplicate files \
residing within specified directories."
LICENSE = "MIT"

PV = "2.2.1"

RPM_NAME = "fdupes-2.2.1-1.3.aarch64.rpm"
RPM_HASH = "c496cbd738748afea86a658eb62b43590fdab57203ee5a97f2bddc0a00631827c65fe9d390fa4fa2b6a51321d5d02aca6c43bc47fd70d34cf2bfcccb82a8b98d"

RPROVIDES:${PN} += "fdupes \
rpm-macro-fdupes"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm

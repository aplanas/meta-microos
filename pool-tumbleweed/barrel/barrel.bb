SUMMARY = "Tool for storage management"
DESCRIPTION = "barrel is a command line tool for storage management."
LICENSE = "GPL-2.0-only"

PV = "0.2.1"

RPM_NAME = "barrel-0.2.1-1.1.aarch64.rpm"
RPM_HASH = "e7ef38f01a9ebf4b1cf74302ffc511dc140a38b555ca3f08b2542fc8e484f5472b8e067885dbb412e028be4943425f9b5e3207d21704208b256dc94c43f9c41e"

RPROVIDES:${PN} += "barrel \
config-barrel"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libjson-c.so.5 \
libreadline.so.8 \
libstdc++.so.6 \
libstorage-ng.so.1 \
libstorage-ng1"

inherit rpm

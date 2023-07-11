SUMMARY = "Srecord libraries"
DESCRIPTION = "This package contains the shared libraries for programs that manipulate EPROM \
load files."
LICENSE = "GPL-3.0+"

PV = "1.64"

RPM_NAME = "libsrecord0-1.64-4.34.aarch64.rpm"
RPM_HASH = "348c00ec9766925b4c0b375bc2bf7b31126124368ce762b58a7f7dad836e349bd0234d06a3c90e7dfb516fffee616c50c25b4075285d8d3cddb9982180a138b8"

RPROVIDES:${PN} += "libsrecord.so.0 \
libsrecord0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgcrypt.so.20 \
libstdc++.so.6"

inherit rpm

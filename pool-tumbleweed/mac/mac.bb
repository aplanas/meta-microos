SUMMARY = "APE codec and decompressor"
DESCRIPTION = "Monkey’s Audio is a fast and easy way to compress digital music."
LICENSE = "SUSE-Permissive"

PV = "8.92"

RPM_NAME = "mac-8.92-1.4.aarch64.rpm"
RPM_HASH = "5e1d7f4c9856c3e7b0b8e7d8b4c205c5b833d515bdf02d41603c8d0aca69a62be2e76c1d9b8c104e200bb077b1d17006935e8e9b3e0b29668bcd9649e22be039"

RPROVIDES:${PN} += "libMAC.so.8 \
mac"

RDEPENDS:${PN} += "/usr/bin/sh \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm

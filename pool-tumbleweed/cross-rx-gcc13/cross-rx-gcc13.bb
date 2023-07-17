SUMMARY = "The GNU Compiler Collection targeting rx"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting rx."
LICENSE = "GPL-3.0-or-later"

PV = "13.1.1+git7552"

RPM_NAME = "cross-rx-gcc13-13.1.1+git7552-1.1.aarch64.rpm"
RPM_HASH = "9485f9eed3d59ecdf7a49b82bbb2995b1c2c26688fa4cc4e531d5ecf8532cf0ad18150a67ffc70f3685cbadaa22d70a33a4b3a6b0f06bbfa2f3afddd9aa9b3b5"

RPROVIDES:${PN} += "cross-rx-gcc13 \
rx-elf-gcc"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-rx-binutils \
libstdc++6-devel-gcc13 \
update-alternatives"

inherit rpm

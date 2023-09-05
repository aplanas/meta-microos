SUMMARY = "The GNU Compiler Collection targeting rx"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting rx."
LICENSE = "GPL-3.0-or-later"

PV = "13.2.1+git7683"

RPM_NAME = "cross-rx-gcc13-13.2.1+git7683-2.1.aarch64.rpm"
RPM_HASH = "676a2dcdf1c0fdd3103915fe2b7a3a5018ca6faf017f4717f678e3dddb629401d7eea3f748ceb7a294e1ecaea3c5b3affdbf7217011003b760f00550870d6a58"

RPROVIDES:${PN} += "cross-rx-gcc13 \
rx-elf-gcc"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-rx-binutils \
libstdc++6-devel-gcc13 \
update-alternatives"

inherit rpm

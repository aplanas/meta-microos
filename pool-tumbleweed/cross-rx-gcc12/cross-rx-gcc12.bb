SUMMARY = "The GNU Compiler Collection targeting rx"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting rx."
LICENSE = "GPL-3.0-or-later"

PV = "12.3.0+git1204"

RPM_NAME = "cross-rx-gcc12-12.3.0+git1204-1.1.aarch64.rpm"
RPM_HASH = "417fb41b55ee8582105ada6d51cc4d4596a4e1814c520fe652459a79215c3512e57e2069eb188c811bd51a0f156822e947cf60951b5c1384e2c69b639a8f26ba"

RPROVIDES:${PN} += "cross-rx-gcc12 \
rx-elf-gcc"

RDEPENDS:${PN} += "/bin/sh \
cross-rx-binutils \
libstdc++6-devel-gcc12 \
update-alternatives"

inherit rpm

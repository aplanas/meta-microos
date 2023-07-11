SUMMARY = "The GNU Compiler Collection targeting rx"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting rx."
LICENSE = "GPL-3.0-or-later"

PV = "13.1.1+git7364"

RPM_NAME = "cross-rx-gcc13-13.1.1+git7364-1.2.aarch64.rpm"
RPM_HASH = "633baa7c61a447030398226c2ccb9f30b0e82b9dc42267771c47f9951a07b4c05825b3ecdae75c68309ad3a6e96d293b010aae4fdeab15a9570e0d0e7ad0e065"

RPROVIDES:${PN} += "cross-rx-gcc13 \
rx-elf-gcc"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-rx-binutils \
libstdc++6-devel-gcc13 \
update-alternatives"

inherit rpm

SUMMARY = "Tools to Check ELF Files for Security Relevant Properties"
DESCRIPTION = "Tools to check ELF files for security relevant properties such as \
non-executable stack."
LICENSE = "GPL-2.0-or-later"

PV = "1.3.7"

RPM_NAME = "pax-utils-1.3.7-1.4.aarch64.rpm"
RPM_HASH = "d7286804134e6be2e64eed9e2e2cbef4f7c5455b2d3a198f3bb3c7ba155e303437c48590655f20a367858c4e6e0586e52ded5db390963fd3d623a70286ee027a"

RPROVIDES:${PN} += "pax-utils"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/env \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcap.so.2"

inherit rpm

SUMMARY = "Utilities for exFAT file system"
DESCRIPTION = "A set of utilities for creating, checking, dumping and labelling exFAT file \
system."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.0"

RPM_NAME = "exfat-utils-1.4.0-1.4.aarch64.rpm"
RPM_HASH = "ebf17b583cbb105572496830ecabf8951f9b65042a36a5810ea31e0749ad77017409b95436a1c1c7237f6b55aa07c3e21b8c7b2f621c9800c5a0cd91b99e889c"

RPROVIDES:${PN} += "exfat-utils"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm

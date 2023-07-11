SUMMARY = "Libzio development files"
DESCRIPTION = "Libzio development files including zio.h, the manual page fzopen(3), \
and static library."
LICENSE = "GPL-2.0-or-later"

PV = "1.08"

RPM_NAME = "libzio-devel-1.08-2.8.aarch64.rpm"
RPM_HASH = "269f5630c0de9d647d08e10b2dbd093f577ab6ba6d5f16c7bbba49c30054f1874263c03856239aeecbce9c2d84e4673a545ec46e0288657851644cd56ec87c82"

RPROVIDES:${PN} += "libzio-devel"

RDEPENDS:${PN} += "libzio1"

inherit rpm

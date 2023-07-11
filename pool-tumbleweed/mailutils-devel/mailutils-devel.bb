SUMMARY = "Development files for GNU Mailutils"
DESCRIPTION = "This package includes libraries and header files for building tools to \
access mailutils features."
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "3.16"

RPM_NAME = "mailutils-devel-3.16-1.3.aarch64.rpm"
RPM_HASH = "47a4eff3214a5f35ebd2f47890e6e6422faf096c850fcb0ff454d177b749d5fe7a9980ecfaf5525787b78ae63dbf911384f3970b678f0ccf2b921e882efc4dca"

RPROVIDES:${PN} += "mailutils-devel"

RDEPENDS:${PN} += "libmailutils9 \
mailutils"

inherit rpm

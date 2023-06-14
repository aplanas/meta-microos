SUMMARY = "Development files for GNU Mailutils"
DESCRIPTION = "This package includes libraries and header files for building tools to \
access mailutils features."
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "3.16"

RPM_NAME = "mailutils-devel-3.16-1.2.aarch64.rpm"
RPM_HASH = "92b39c8e035c12cd73c48a68de12dd016eb8bc82dc9008494324fb01e1e8d722fb69dc1f5d0f5a47462db0f298d58f9eb56c997a8cee37bb3ee88872fae90a03"

RPROVIDES:${PN} += "mailutils-devel"

RDEPENDS:${PN} += "libmailutils9 \
mailutils"

inherit rpm

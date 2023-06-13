SUMMARY = "ATA S.M.A.R.T. Disk Health Monitoring Library - Development Files"
DESCRIPTION = "A small and lightweight parser library for ATA S.M.A.R.T. hard disk \
health monitoring."
LICENSE = "LGPL-2.1-or-later"

PV = "0.19"

RPM_NAME = "libatasmart-devel-0.19-10.12.aarch64.rpm"
RPM_HASH = "1d95c884918c9fdd0eb111e4910b9a822f32c795cfba2c58ee951faf0e7289f2ca844502098ce96b864f9ab0a7bc607cecafcd297c9333726459d005158895a2"

RPROVIDES:${PN} += "libatasmart-devel \
libatasmart-devel(aarch-64) \
pkgconfig(libatasmart)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libatasmart4"

inherit rpm

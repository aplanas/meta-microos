SUMMARY = "Shared library for libmetaio - LIGO Light-Weight XML library"
DESCRIPTION = "This package contains the shared-object libraries needed to run applications \
that use the LAL MetaIO library."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.0"

RPM_NAME = "liblalmetaio10-3.0.0-1.2.aarch64.rpm"
RPM_HASH = "d2753dec091b6a0c2d14007137abca2ee4cf619d03491c2d3965f230265e24901284ddf7ec2caa30709b610ac13660c86b2920b8dae904a64653899b8ce11388"

RPROVIDES:${PN} += "liblalmetaio.so.10 \
liblalmetaio10"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
liblal.so.20 \
liblalsupport.so.14 \
libmetaio.so.1"

inherit rpm

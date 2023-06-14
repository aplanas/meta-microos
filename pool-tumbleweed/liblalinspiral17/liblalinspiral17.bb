SUMMARY = "Shared library for LAL Inspiral"
DESCRIPTION = "This package contains the shared-object libraries needed to run applications \
that use the LAL Inspiral library."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.0"

RPM_NAME = "liblalinspiral17-3.0.0-1.2.aarch64.rpm"
RPM_HASH = "ab93c0f3b055073eac43644f508f0cc8119e8f9e1e8b6b904d7f228fc953717624784ed182c3c384258516b2bd5f5f727e54e761ac17194328f1b78547cfa6cd"

RPROVIDES:${PN} += "liblalinspiral.so.17 \
liblalinspiral17"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgsl.so.25 \
liblal.so.20 \
liblalburst.so.6 \
liblalframe.so.13 \
liblalmetaio.so.10 \
liblalsimulation.so.31 \
liblalsupport.so.14 \
libm.so.6 \
libmetaio.so.1"

inherit rpm

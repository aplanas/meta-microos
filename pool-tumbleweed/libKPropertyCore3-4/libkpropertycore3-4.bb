SUMMARY = "Core library for the Property editing framework"
DESCRIPTION = "The Core library for the property editing framework with editor widget similar to what is known from Qt Designer"
LICENSE = "LGPL-2.0-only"

PV = "3.2.0"

RPM_NAME = "libKPropertyCore3-4-3.2.0-2.22.aarch64.rpm"
RPM_HASH = "c61c184683a6d06fb527a42dba19ab6ad9a737aec36ee292b1210ca9990ab8b404de2b396c1ecca5418c7ad10f20ca9cf7489e24a99f70a606c0ab46926a6269"

RPROVIDES:${PN} += "libKPropertyCore3-4 \
libKPropertyCore3.so.4"

RDEPENDS:${PN} += "/sbin/ldconfig \
kproperty \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm

SUMMARY = "Connect to the Jack Sound Server with Qt"
DESCRIPTION = "QJack makes you connect with the Jack soundserver system with Qt."
LICENSE = "GPL-2.0-or-later"

PV = "0.0+20170112"

RPM_NAME = "libqjack-devel-0.0+20170112-3.23.aarch64.rpm"
RPM_HASH = "546808b05e3df296e5ae20df943728c3f0ce458b0abffa1695e568cda026fcacc47e0c277f0b2b2e6e12f70eecd3318d09f2336dee83f3275e8131053ff5de1d"

RPROVIDES:${PN} += "libqjack-devel"

RDEPENDS:${PN} += "jack-devel \
libqjack0 \
pkgconfig-Qt5Core"

inherit rpm

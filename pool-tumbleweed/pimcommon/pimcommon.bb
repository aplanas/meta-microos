SUMMARY = "Base package of KDE PIM PimCommon library"
DESCRIPTION = "This package contains the pimcommon library, used by several KDE PIM \
applications."
LICENSE = "GPL-2.0-only & LGPL-2.1-or-later"

PV = "23.04.3"

RPM_NAME = "pimcommon-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "c852cd4d947629aabee03a707a33f9bc76364f280c887c211e81f6985943dbba556883f328a1d628589aa337cbbd78a53e812a859e77a4ebf729306bba15965b"

RPROVIDES:${PN} += "pimcommon"

RDEPENDS:${PN} += ""

inherit rpm

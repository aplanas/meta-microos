SUMMARY = "KDE PIM Libraries: Build Environment"
DESCRIPTION = "This package contains necessary include files and libraries needed \
to develop KDE PIM applications."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "kmbox-devel-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "33a6abe4afacbc340aab751b24a3697e4720813b0890b33b136f1713225ef8eeaf5b5b5243319f190363e86e0ca25f317ba2b2a22ced07aece680c187d36bdaa"

RPROVIDES:${PN} += "cmake(KF5Mbox) \
cmake(KPim5Mbox) \
kmbox-devel \
kmbox-devel(aarch-64)"

RDEPENDS:${PN} += "cmake(KPim5Mime) \
libKPim5Mbox5"

inherit rpm

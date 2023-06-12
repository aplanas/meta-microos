SUMMARY = "KDE PIM Libraries: Build Environment"
DESCRIPTION = "This package contains necessary include files and libraries needed \
to develop KDE PIM applications."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "kontactinterface-devel-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "2f238c1bd09b1bdbc035449133676ab99829e6b4c76b026fb181fb6c917957a23e00a478ae613f1c2fc3345411079542f209a6d4acf78f54915eeefc91093751"

RPROVIDES:${PN} += "cmake(KF5KontactInterface) \
cmake(KPim5KontactInterface) \
kontactinterface-devel \
kontactinterface-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(KF5Parts) \
libKPim5KontactInterface5"

inherit rpm

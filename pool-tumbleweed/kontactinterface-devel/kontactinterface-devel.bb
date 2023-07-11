SUMMARY = "KDE PIM Libraries: Build Environment"
DESCRIPTION = "This package contains necessary include files and libraries needed \
to develop KDE PIM applications."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.3"

RPM_NAME = "kontactinterface-devel-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "6ecd75f5d0f3b2cc02bc8a4a24dfbe11eb93a1a684c621e07243ccc06aad95e3bd950a171685ebbc8eaab149d5e4d92a9400d5c4edb8ff5fee41a50bc56ab446"

RPROVIDES:${PN} += "cmake-KF5KontactInterface \
cmake-KPim5KontactInterface \
kontactinterface-devel"

RDEPENDS:${PN} += "cmake-KF5Parts \
libKPim5KontactInterface5"

inherit rpm

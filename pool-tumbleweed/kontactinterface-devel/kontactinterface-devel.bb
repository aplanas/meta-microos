SUMMARY = "KDE PIM Libraries: Build Environment"
DESCRIPTION = "This package contains necessary include files and libraries needed \
to develop KDE PIM applications."
LICENSE = "LGPL-2.1-or-later"

PV = "23.08.0"

RPM_NAME = "kontactinterface-devel-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "ae919091a831f11afb294a7e684da02c4bf68d74e97adc9d1d4d37431cf8f673b173a48d92e9cde2b91483cab8677bd59eaf7efd4bb059bcbc9df942cbedcdad"

RPROVIDES:${PN} += "cmake-KPim5KontactInterface \
kontactinterface-devel"

RDEPENDS:${PN} += "cmake-KF5Parts \
libKPim5KontactInterface5"

inherit rpm

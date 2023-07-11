SUMMARY = "Build environment for the KDE PIM MIME libraries"
DESCRIPTION = "This package contains necessary include files and libraries needed \
to develop KDE PIM applications."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.3"

RPM_NAME = "kmime-devel-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "2d87812bf5e29fba958ab8737826f72c780c4cbb32feff6ff919ab7fc1f8a6df4c4eb5a6d2d6054621ae51f93532031fbfd52e310022adbc5563e69fd28069ce"

RPROVIDES:${PN} += "cmake-KF5Mime \
cmake-KPim5Mime \
kmime-devel"

RDEPENDS:${PN} += "cmake-KF5Codecs \
libKPim5Mime5"

inherit rpm

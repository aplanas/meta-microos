SUMMARY = "KDE Framework for providing different actions given a string query"
DESCRIPTION = "Files needed for developing custom runners or frontends."
LICENSE = "LGPL-2.1-or-later"

PV = "5.109.0"

RPM_NAME = "krunner-devel-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "ac8fb833153effda7156d6daea7a1e0027564f429ab5e64baf2749bcf97d40dc3ab3a050f1f628566f4d3a9b86ccb759289a72584d69d5ea01ef428139dc5cf7"

RPROVIDES:${PN} += "cmake-KF5Runner \
krunner-devel"

RDEPENDS:${PN} += "cmake-KF5Plasma \
cmake-Qt5Core \
extra-cmake-modules \
libKF5Runner5"

inherit rpm

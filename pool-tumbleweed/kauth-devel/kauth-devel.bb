SUMMARY = "Framework which lets applications perform actions as a privileged user"
DESCRIPTION = "KAuth is a framework to let applications perform actions as a privileged user. \
Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.109.0"

RPM_NAME = "kauth-devel-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "f06964cd07880bdd807bbbd2878a72bdd39eaed2e991596af99f8260e90a6dec780c59e422ef86b864d3d19174ed384dba858bbcf500e315b3f9e18ca8a19849"

RPROVIDES:${PN} += "cmake-KF5Auth \
kauth-devel"

RDEPENDS:${PN} += "cmake-KF5CoreAddons \
extra-cmake-modules \
libKF5Auth5"

inherit rpm

SUMMARY = "Framework which lets applications perform actions as a privileged user"
DESCRIPTION = "KAuth is a framework to let applications perform actions as a privileged user. \
Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.107.0"

RPM_NAME = "kauth-devel-5.107.0-1.1.aarch64.rpm"
RPM_HASH = "39eb15ac9a5f36ef6eb3c72f790b2e334912ea0646d3dfc5bfc59c96d5a08d4cd5f50dac717a60493b04544d6ccc0d91d841450a60ec7eddaa56478ad9fb0f04"

RPROVIDES:${PN} += "cmake-KF5Auth \
kauth-devel"

RDEPENDS:${PN} += "cmake-KF5CoreAddons \
extra-cmake-modules \
libKF5Auth5"

inherit rpm

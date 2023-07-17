SUMMARY = "Framework which lets applications perform actions as a privileged user"
DESCRIPTION = "KAuth is a framework to let applications perform actions as a privileged user. \
Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.108.0"

RPM_NAME = "kauth-devel-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "73dc88bf86052ffd802569a76919ca94b56bb6ea8a52e3757f7fae4bfd6035fd0f221b12dc6adbe42cc22e9cb1f1125a25842ff7a31a777dd3d6c03b5e11091e"

RPROVIDES:${PN} += "cmake-KF5Auth \
kauth-devel"

RDEPENDS:${PN} += "cmake-KF5CoreAddons \
extra-cmake-modules \
libKF5Auth5"

inherit rpm

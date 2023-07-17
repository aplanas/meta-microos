SUMMARY = "Non-binary asset user-installable package managing framework"
DESCRIPTION = "This framework lets applications to manage user installable packages of non-binary assets. \
Development files."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "5.108.0"

RPM_NAME = "kpackage-devel-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "6197b5ab70b2d5bd13417a029e30b723df355849c98d40e9498db75ca3e0e6998dc13ecbdb51689d61205b8b5d3160a8bcc2d9632ff251bbab68edce42b380cf"

RPROVIDES:${PN} += "cmake-KF5Package \
kpackage-devel"

RDEPENDS:${PN} += "cmake-KF5CoreAddons \
extra-cmake-modules \
kpackage"

inherit rpm

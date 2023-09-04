SUMMARY = "Non-binary asset user-installable package managing framework"
DESCRIPTION = "This framework lets applications to manage user installable packages of non-binary assets. \
Development files."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "5.109.0"

RPM_NAME = "kpackage-devel-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "021663417e06d92cfce9d193f4210503c42e82c1a49aab1cb45c7e98a243a0f919ab6216d3297195f436f857021493982aea14e97422f5fc391b951023dc919c"

RPROVIDES:${PN} += "cmake-KF5Package \
kpackage-devel"

RDEPENDS:${PN} += "cmake-KF5CoreAddons \
extra-cmake-modules \
kpackage"

inherit rpm

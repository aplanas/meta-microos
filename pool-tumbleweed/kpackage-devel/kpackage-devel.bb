SUMMARY = "Non-binary asset user-installable package managing framework"
DESCRIPTION = "This framework lets applications to manage user installable packages of non-binary assets. \
Development files."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "5.107.0"

RPM_NAME = "kpackage-devel-5.107.0-1.1.aarch64.rpm"
RPM_HASH = "5902454a2bf0c98603b2ac9c60876be353d3cad6fd59ca06c5c03539622395c4ee87cf1e48a2bc06c22a4eceecb44e32fcaa50593c8b678ba028bb55f460a882"

RPROVIDES:${PN} += "cmake-KF5Package \
kpackage-devel"

RDEPENDS:${PN} += "cmake-KF5CoreAddons \
extra-cmake-modules \
kpackage"

inherit rpm

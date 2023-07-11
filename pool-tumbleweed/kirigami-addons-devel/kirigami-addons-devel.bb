SUMMARY = "Development files for kirigami-addons"
DESCRIPTION = "A set of 'widgets' i.e visual end user components along with a \
code to support them. Components are usable by both touch and \
desktop experiences providing a native experience on both, and \
look native with any QQC2 style (qqc2-desktop-theme, Material \
or Plasma). This package provides development files to build \
applications with kirigami-addons."
LICENSE = "LGPL-3.0-only"

PV = "0.9.0"

RPM_NAME = "kirigami-addons-devel-0.9.0-1.1.aarch64.rpm"
RPM_HASH = "e3dfd39dae0d202ba39a936a7879fc2a84e4979f1b8bd5f4e2ac0cd863cbf853b863664cc6d3882e9ac01954971dca9808c8f6b9ca9356ade6330aedfe62e042"

RPROVIDES:${PN} += "cmake-KF5KirigamiAddons \
kirigami-addons-devel"

RDEPENDS:${PN} += "kirigami-addons"

inherit rpm

SUMMARY = "Development files for kirigami-addons"
DESCRIPTION = "A set of 'widgets' i.e visual end user components along with a \
code to support them. Components are usable by both touch and \
desktop experiences providing a native experience on both, and \
look native with any QQC2 style (qqc2-desktop-theme, Material \
or Plasma). This package provides development files to build \
applications with kirigami-addons."
LICENSE = "LGPL-3.0-only"

PV = "0.11.0"

RPM_NAME = "kirigami-addons-devel-0.11.0-1.1.aarch64.rpm"
RPM_HASH = "fea27e5224d134224557338f98c718d1237345919e6a4e0dbcb02401419a6d44f417ba180fc12e525be64f8a056a31885246751dd0e0759bee6e7b30ff3f97aa"

RPROVIDES:${PN} += "cmake-KF5KirigamiAddons \
kirigami-addons-devel"

RDEPENDS:${PN} += "kirigami-addons"

inherit rpm

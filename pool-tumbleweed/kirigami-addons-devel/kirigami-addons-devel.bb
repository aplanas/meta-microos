SUMMARY = "Development files for kirigami-addons"
DESCRIPTION = "A set of 'widgets' i.e visual end user components along with a \
code to support them. Components are usable by both touch and \
desktop experiences providing a native experience on both, and \
look native with any QQC2 style (qqc2-desktop-theme, Material \
or Plasma). This package provides development files to build \
applications with kirigami-addons."
LICENSE = "LGPL-3.0-only"

PV = "0.10.0"

RPM_NAME = "kirigami-addons-devel-0.10.0-1.1.aarch64.rpm"
RPM_HASH = "f8b10b1d177c642bfe7935e9e8dd385e34e7716f6f06c3f690f4f6edc2831e374fb2cc4bc9d7ad1f3e477eb89e5ed1a8127c796a2bf23b044093a5f89a5391ed"

RPROVIDES:${PN} += "cmake-KF5KirigamiAddons \
kirigami-addons-devel"

RDEPENDS:${PN} += "kirigami-addons"

inherit rpm

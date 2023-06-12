SUMMARY = "Development files for kirigami-addons"
DESCRIPTION = "A set of 'widgets' i.e visual end user components along with a \
code to support them. Components are usable by both touch and \
desktop experiences providing a native experience on both, and \
look native with any QQC2 style (qqc2-desktop-theme, Material \
or Plasma). This package provides development files to build \
applications with kirigami-addons."
LICENSE = "LGPL-3.0-only"

PV = "0.8.0"

RPM_NAME = "kirigami-addons-devel-0.8.0-1.2.aarch64.rpm"
RPM_HASH = "a65b865659301d81552ebc80385220036a9015a2b8ddbef8e274bcc855187f88f599a91e8c1f0d52cd63980f875f09b87e09255c0b8e82021f542cadcd85230d"

RPROVIDES:${PN} += "cmake(KF5KirigamiAddons) \
kirigami-addons-devel \
kirigami-addons-devel(aarch-64)"
RDEPENDS:${PN} += "kirigami-addons"

inherit rpm

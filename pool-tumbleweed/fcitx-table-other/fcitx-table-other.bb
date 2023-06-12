SUMMARY = "A fork of ibus-table-others for Fcitx"
DESCRIPTION = "Fcitx-table-other is a fork of ibus-table-others for Fcitx. \
provides non-Chinese additional tables."
LICENSE = "GPL-3.0-or-later"

PV = "0.2.4"

RPM_NAME = "fcitx-table-other-0.2.4-2.5.noarch.rpm"
RPM_HASH = "f7d41f30a4ade89d72446265fcb0cac1089d55d3d5f9506259d9fe443946ef6a719ed9578d0c9875b3582a8a32d11c5af08d2bb0c07d263eb1bcefe4af65c566"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fcitx-table-other"
RDEPENDS:${PN} += ""

inherit rpm

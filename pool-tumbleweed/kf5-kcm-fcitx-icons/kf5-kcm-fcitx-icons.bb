SUMMARY = "Keyboard icons for kf5-kcm-fcitx"
DESCRIPTION = "This package provides systemsettings5 icons for fcitx in plasma5-workspace."
LICENSE = "GPL-2.0-or-later"

PV = "0.5.6"

RPM_NAME = "kf5-kcm-fcitx-icons-0.5.6-3.14.noarch.rpm"
RPM_HASH = "528fb0a3fa94f6986ed29de2eb743d1f96fcd8d03ff9c7564b8151c31a8e98be9ec08a0f53e4fe771c9fb2e9c17a33a7d5a9d28f3dd47ebaf5a0fca1a86e43ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fcitx-config-kde5-icons \
fcitx-kcm-icons \
kf5-kcm-fcitx-icons"

RDEPENDS:${PN} += "kf5-kcm-fcitx"

inherit rpm

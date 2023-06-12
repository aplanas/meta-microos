SUMMARY = "Translations for package budgie-desktop-view"
DESCRIPTION = "Provides translations for the 'budgie-desktop-view' package."
LICENSE = "Apache-2.0"

PV = "1.2.1+0"

RPM_NAME = "budgie-desktop-view-lang-1.2.1+0-1.3.noarch.rpm"
RPM_HASH = "ef788ea81ca2f589b1e38db59c372d320b30c3a60f0546778cc437cc369114ad8d41f992a8270d473fee5c35f18869fffc1e74ebb318f0adb33145740b349a00"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "budgie-desktop-view-lang \
budgie-desktop-view-lang-all \
locale(budgie-desktop-view:cs) \
locale(budgie-desktop-view:en_GB) \
locale(budgie-desktop-view:en_US) \
locale(budgie-desktop-view:es) \
locale(budgie-desktop-view:es_MX) \
locale(budgie-desktop-view:fr) \
locale(budgie-desktop-view:he) \
locale(budgie-desktop-view:ja) \
locale(budgie-desktop-view:ko) \
locale(budgie-desktop-view:lt) \
locale(budgie-desktop-view:pt_BR) \
locale(budgie-desktop-view:pt_PT) \
locale(budgie-desktop-view:ru) \
locale(budgie-desktop-view:sq) \
locale(budgie-desktop-view:tr) \
locale(budgie-desktop-view:uk) \
locale(budgie-desktop-view:zh) \
locale(budgie-desktop-view:zh_CN)"
RDEPENDS:${PN} += "budgie-desktop-view"

inherit rpm

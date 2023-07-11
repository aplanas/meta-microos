SUMMARY = "Translations for package pavucontrol-qt"
DESCRIPTION = "Provides translations for the 'pavucontrol-qt' package."
LICENSE = "GPL-2.0-only"

PV = "1.3.0"

RPM_NAME = "pavucontrol-qt-lang-1.3.0-1.2.noarch.rpm"
RPM_HASH = "7e7d485e19900c21a495435493fd2abc4c6d55bbc71b64827cbb61f1cf3f123a4ef103a512f19b48c50679e39bffbaba08cfaebaf92ed3106b4a611adc195e16"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pavucontrol-qt-lang \
pavucontrol-qt-lang-all"

RDEPENDS:${PN} += "pavucontrol-qt"

inherit rpm

SUMMARY = "Baekmuk Fonts, TrueType Version"
DESCRIPTION = "Baekmuk Fonts (Korean fonts for the X Window System, True Type \
version)."
LICENSE = "HPND"

PV = "2.2"

RPM_NAME = "baekmuk-ttf-fonts-2.2-1.4.noarch.rpm"
RPM_HASH = "bb4b398b1149eca0b96378d90fe733496e4536914256268223725aff50237fb12eb60990c82dc121f56c0ba97d929cd12dfae7f9cc50ef225be1be8b760811c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "baekmuk-ttf \
baekmuk-ttf-fonts \
config(baekmuk-ttf-fonts) \
locale(ko) \
scalable-font-ko"
RDEPENDS:${PN} += "/bin/sh"

inherit rpm

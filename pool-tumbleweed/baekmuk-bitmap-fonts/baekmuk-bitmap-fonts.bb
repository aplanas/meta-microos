SUMMARY = "Baekmuk Fonts, Bitmap Version"
DESCRIPTION = "Baekmuk Fonts (Korean fonts for the X Window System, bitmap version)."
LICENSE = "HPND"

PV = "2.2"

RPM_NAME = "baekmuk-bitmap-fonts-2.2-1.4.noarch.rpm"
RPM_HASH = "d0495ec8a270e0c521b5b704cb797cddfc2e6c3f4c608628a6a57ea9887bf0cfdcd34537a23df4940db1c17c92f6adaf4e6a75f49c02dd0757232b7f1754a111"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "baekmuk \
baekmuk-bitmap-fonts \
locale-xorg-x11-ko"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm

SUMMARY = "Open-source Russian GOST Fonts (TrueType Format)"
DESCRIPTION = "Open-source version of the fonts by Russian standard GOST 2.304-81 \
«Letters for drawings». \
 \
This package contains fonts in TrueType format."
LICENSE = "OFL-1.1"

PV = "0.3"

RPM_NAME = "opengost-ttf-fonts-0.3-7.18.noarch.rpm"
RPM_HASH = "20e6b2902156af57247245137bb518d766d84fc166ac8461f3ec4ad5a49a9b4b627b2a8faec75b15520a1b99113b4c22ee18a099e66ea9cc7ad4ac2b6e9fa89c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "opengost-ttf-fonts"
RDEPENDS:${PN} += "/bin/sh"

inherit rpm

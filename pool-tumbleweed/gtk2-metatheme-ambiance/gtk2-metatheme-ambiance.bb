SUMMARY = "Ambiance Gtk Theme -- GTK+ 2 Support"
DESCRIPTION = "Includes an Ambiance light-on-dark theme. \
 \
Introduced as the default theme in Ubuntu 10.04 LTS."
LICENSE = "GPL-3.0-or-later"

PV = "20.10"

RPM_NAME = "gtk2-metatheme-ambiance-20.10-2.2.noarch.rpm"
RPM_HASH = "f65c5e9b4509e4308ce847fe2f21dad5c574cb8ae9ce01f5d69a7f53a3805ddd7c4536076154737906635605c675cebaae288805f2fcb92928ffe78ab35c6a2c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtk2-metatheme-ambiance"

RDEPENDS:${PN} += "gtk2-engine-murrine \
metatheme-ambiance-common"

inherit rpm

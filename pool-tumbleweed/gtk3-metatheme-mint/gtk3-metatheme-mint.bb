SUMMARY = "Mint Themes -- GTK+ 3 Support"
DESCRIPTION = "A collection of Mint GTK+ themes."
LICENSE = "GPL-3.0-or-later"

PV = "2.0.8"

RPM_NAME = "gtk3-metatheme-mint-2.0.8-1.1.noarch.rpm"
RPM_HASH = "12543fefcf1f4af489a4d1c798556252b016dd947828fc27d3dbb54210f097e63726c8f2539f83b71e567b4df30125ed4f263a9d897fc988b2db5ca2420ff4c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtk3-metatheme-mint \
mint-themes-gtk3"

RDEPENDS:${PN} += "metatheme-mint-common"

inherit rpm

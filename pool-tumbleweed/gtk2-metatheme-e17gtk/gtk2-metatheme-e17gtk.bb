SUMMARY = "The Enlightenment GTK theme -- GTK+ 2 Support"
DESCRIPTION = "The dark GTK2/GTK3 theme with sharp corners, which is designed for use in \
Enlightenment and gives the elegant look of Enlightenment to GTK widgets. \
 \
This package contains the GTK+2 theme."
LICENSE = "GPL-3.0"

PV = "3.22.2"

RPM_NAME = "gtk2-metatheme-e17gtk-3.22.2-1.11.noarch.rpm"
RPM_HASH = "ddf0f48f388d57f0b11bbf84fe938465040627cc8a1b8d1ac05b3d7763b3731c4fe168c763c9fad310f5e5ae0e6214377c212d85878a4a5451ebb45d907ed265"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtk2-metatheme-e17gtk"

RDEPENDS:${PN} += "gtk2-engine-murrine \
metatheme-e17gtk-common"

inherit rpm

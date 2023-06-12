SUMMARY = "A Clean Minimalistic Theme for GNOME, XFCE, GTK+ 2 and 3 -- GTK+ 3 Support"
DESCRIPTION = "The Bluebird Theme for GTK2/3 and xfwm4/emerald/metacity started out on the \
basis of Bluebird, but aims at reworking the intense blue tone to a more \
neutral blue-ish look that will be more pleasant to look at in everyday use. \
 \
This package provides the GTK+ 3 support of Bluebird."
LICENSE = "GPL-2.0-or-later | CC-BY-SA-3.0"

PV = "1.3"

RPM_NAME = "gtk3-metatheme-bluebird-1.3-2.9.noarch.rpm"
RPM_HASH = "976f94ef9c51ea0ea6b05f1d1acd387910fca0665aeeb64d63fc493e4a96639333bdcad5ebc151c4af3ccccc3827deae0a02b775b1b42ad4e20a1bab1c90ea81"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtk3-metatheme-bluebird"
RDEPENDS:${PN} += "metatheme-bluebird-common"

inherit rpm

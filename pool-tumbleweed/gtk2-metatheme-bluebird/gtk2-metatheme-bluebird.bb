SUMMARY = "A Clean Minimalistic Theme for GNOME, XFCE, GTK+ 2 and 3 -- GTK+ 2 Support"
DESCRIPTION = "The Bluebird Theme for GTK2/3 and xfwm4/emerald/metacity started out on the \
basis of Bluebird, but aims at reworking the intense blue tone to a more \
neutral blue-ish look that will be more pleasant to look at in everyday use. \
 \
This package provides the GTK+ 2 support of Bluebird."
LICENSE = "GPL-2.0-or-later | CC-BY-SA-3.0"

PV = "1.3"

RPM_NAME = "gtk2-metatheme-bluebird-1.3-2.9.noarch.rpm"
RPM_HASH = "ea133f36275bc147b45ec5beb9b7aeda9bdf23b229387fea55bcb4d0048c02605392b650d45652b07a2caf8556f866c3aa933ae66eee5f58c7cfbd5d19669b91"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtk2-metatheme-bluebird"

RDEPENDS:${PN} += "gtk2-engine-murrine \
metatheme-bluebird-common"

inherit rpm

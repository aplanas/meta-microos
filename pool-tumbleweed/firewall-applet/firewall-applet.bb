SUMMARY = "Firewall panel applet"
DESCRIPTION = "The firewall panel applet provides a status information of firewalld and also \
the firewall settings."
LICENSE = "GPL-2.0-or-later"

PV = "2.0.0"

RPM_NAME = "firewall-applet-2.0.0-2.1.noarch.rpm"
RPM_HASH = "9a2715609a891653d6602d10b990cdfcf7e9dc3d14680ffad6effb7727b76c225210608225d0d10b4594b53eb3bc02b7b109fc26115f12ae010fc5571e0f0e0e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-firewall-applet \
firewall-applet"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
firewall-config \
hicolor-icon-theme \
python3-gobject \
python3-qt5 \
typelib-Notify"

inherit rpm

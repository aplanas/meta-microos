SUMMARY = "Firewall panel applet"
DESCRIPTION = "The firewall panel applet provides a status information of firewalld and also \
the firewall settings."
LICENSE = "GPL-2.0-or-later"

PV = "2.0.0"

RPM_NAME = "firewall-applet-2.0.0-1.1.noarch.rpm"
RPM_HASH = "2b6891e28fbc818652c61011329a765154e6830382952dad6fbbdcb5b12dcac5940a6ec83e717106c4426aa28c7a0db4941ffb8d51854d6f2b31d108ef809300"
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

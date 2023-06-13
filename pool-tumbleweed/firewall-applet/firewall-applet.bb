SUMMARY = "Firewall panel applet"
DESCRIPTION = "The firewall panel applet provides a status information of firewalld and also \
the firewall settings."
LICENSE = "GPL-2.0-or-later"

PV = "1.3.2"

RPM_NAME = "firewall-applet-1.3.2-2.1.noarch.rpm"
RPM_HASH = "d8df94fe41843b6b646181ce6f3c2ef4ef2de2e5bedbfa349f6be362e90ba1404cecf699231810071063afbfa4a5ef73a99c29f9af1ebdff8a53762b9a766196"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(firewall-applet) \
firewall-applet"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3 \
firewall-config \
hicolor-icon-theme \
python3-gobject \
python3-qt5 \
typelib(Notify)"

inherit rpm

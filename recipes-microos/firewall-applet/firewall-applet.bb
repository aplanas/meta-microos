SUMMARY = "Firewall panel applet"
DESCRIPTION = "The firewall panel applet provides a status information of firewalld and also \
the firewall settings."
LICENSE = "GPL-2.0-or-later"

PV = "1.3.2"

RPM_NAME = "firewall-applet-1.3.2-1.1.noarch.rpm"
RPM_HASH = "371e15c856ba297ef7266036b0179c28b498808eff2193d51d9c374e5d969ea2d4a394c090535b80cfee3cc128f76ff60fee115fbfe4b2ea9092ff4596534f36"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(firewall-applet) firewall-applet"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3 firewall-config hicolor-icon-theme python3-gobject python3-qt5 typelib(Notify)"

inherit rpm

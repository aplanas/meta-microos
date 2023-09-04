SUMMARY = "Default openSUSE branding for NetworkManager configuration file."
DESCRIPTION = "NetworkManager attempts to keep an active network connection available \
at all times.  The point of NetworkManager is to make networking \
configuration and setup as painless and automatic as possible.	If \
using DHCP, NetworkManager is intended to replace default routes, \
obtain IP addresses from a DHCP server, and change name servers \
whenever it sees fit. \
 \
This package provides the default openSUSE configuration for \
/usr/lib/NetworkManager/conf.d/conncheck.conf, configured to \
check connectivity against http://conncheck.opensuse.org."
LICENSE = "GPL-2.0-or-later"

PV = "42.1"

RPM_NAME = "NetworkManager-branding-openSUSE-42.1-5.12.noarch.rpm"
RPM_HASH = "d6f30d921fce528a4e91c022b0fb167a1fc9ed324b88e4dc1eb015c1de04f103905772f00f6b7f1b193b4787b9917fb48ed08d42267f76a0a809ebf5c355fe79"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "NetworkManager-branding \
NetworkManager-branding-openSUSE"

RDEPENDS:${PN} += "NetworkManager"

inherit rpm

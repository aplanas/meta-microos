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

RPM_NAME = "NetworkManager-branding-openSUSE-42.1-5.10.noarch.rpm"
RPM_HASH = "a79a862de78fd5b4616ce6c3d0e627b6bca2208331833779533c34beef16186e19572d5896365ea830c2378b1125ebbf72aa2482a12c7e13387e3c0c6a80ba9d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "NetworkManager-branding \
NetworkManager-branding-openSUSE"
RDEPENDS:${PN} += "NetworkManager"

inherit rpm

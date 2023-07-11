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

RPM_NAME = "NetworkManager-branding-openSUSE-42.1-5.11.noarch.rpm"
RPM_HASH = "aa99e52466302b41ecc755652ff6f42b91389351dc800667703686aa251c72a1efdfad1e77a2a12b783d2fad8490c9e38de801fd9de7c98dfda892561e6623ce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "NetworkManager-branding \
NetworkManager-branding-openSUSE"

RDEPENDS:${PN} += "NetworkManager"

inherit rpm

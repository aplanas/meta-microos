SUMMARY = "Common data for the 'transmission' BitTorrent client"
DESCRIPTION = "Transmission is a BitTorrent client. It has GTK+ and Qt GUI clients, \
a daemon for servers and headless use, and both can be remote \
controlled by HTTP and the terminal. It supports Local Peer \
Discovery, DHT, µTP, PEX and magnet links."
LICENSE = "(GPL-2.0-only | GPL-3.0-only) & MIT"

PV = "4.0.3"

RPM_NAME = "transmission-common-4.0.3-2.1.noarch.rpm"
RPM_HASH = "b837083fd5c67d2f4364e00f010b6e17412e62faf8ed834fcfef6ff78fd6f22b40931f7c755e4aef9a65f924e5c89825aa41aba03f3b251a416b46659ffed3b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "transmission-common"

RDEPENDS:${PN} += "transmission-ui"

inherit rpm

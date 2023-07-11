SUMMARY = "Common data for the 'transmission' BitTorrent client"
DESCRIPTION = "Transmission is a BitTorrent client. It has GTK+ and Qt GUI clients, \
a daemon for servers and headless use, and both can be remote \
controlled by HTTP and the terminal. It supports Local Peer \
Discovery, DHT, µTP, PEX and magnet links."
LICENSE = "(GPL-2.0-only | GPL-3.0-only) & MIT"

PV = "4.0.3"

RPM_NAME = "transmission-common-4.0.3-2.2.noarch.rpm"
RPM_HASH = "bfe12dac998bd7782464b0d488499deb7a80e16460fdbf1055e4072e4380c16dcbf44f6e355ab20c86fd100e4df77336fcec52e6bd8b61d7942968098f757e74"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "transmission-common"

RDEPENDS:${PN} += "transmission-ui"

inherit rpm

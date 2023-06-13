SUMMARY = "BitTorrent client"
DESCRIPTION = "EFL and libtorrent based BitTorrent client."
LICENSE = "GPL-3.0"

PV = "0.7.0"

RPM_NAME = "epour-0.7.0-1.17.aarch64.rpm"
RPM_HASH = "83e032e110cfdc3c9387a90e80ddfe844595271fcbbda38f8a43b94aa344a0613724397148ce62fbc436be4f524d1f1d47a4f9298b364667e0cad4e5a1b63201"

RPROVIDES:${PN} += "application() \
application(epour.desktop) \
epour \
epour(aarch-64) \
mimehandler(application/x-bittorrent) \
mimehandler(x-scheme-handler/magnet) \
python3.10dist(epour) \
python3dist(epour)"

RDEPENDS:${PN} += "/usr/bin/python3 \
python(abi) \
python3-dbus-python \
python3-efl \
python3-libtorrent-rasterbar \
python3-xdg"

inherit rpm

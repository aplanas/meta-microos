SUMMARY = "GStreamer modules and libraries for videoconferencing -- Codec preferences"
DESCRIPTION = "Farstream is a collection of GStreamer modules and libraries for \
videoconferencing. \
 \
This package contains data (codec preferences, element properties) \
used by the library."
LICENSE = "LGPL-2.1-or-later"

PV = "0.2.9+5"

RPM_NAME = "farstream-data-0.2.9+5-2.4.noarch.rpm"
RPM_HASH = "5c08993b31b54f53b2b2936c907ff9ce1155293188445be4000f1057e8de3242bfd66872fd7172a9d1f1579136f0a88d4a5b97b244e75749e5107af5cf135114"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "farstream-data"

RDEPENDS:${PN} += ""

inherit rpm

SUMMARY = "GStreamer modules and libraries for videoconferencing -- Codec preferences"
DESCRIPTION = "Farstream is a collection of GStreamer modules and libraries for \
videoconferencing. \
 \
This package contains data (codec preferences, element properties) \
used by the library."
LICENSE = "LGPL-2.1-or-later"

PV = "0.2.9+5"

RPM_NAME = "farstream-data-0.2.9+5-2.3.noarch.rpm"
RPM_HASH = "5f91eb44af4417ff3a291d3bf9f77df6c022fc427d4152916ba4697db919c98437aaece12391a78533f9675f4d64a74d8ff196ba963fa0a7c327a62c8c603f0a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "farstream-data"
RDEPENDS:${PN} += ""

inherit rpm

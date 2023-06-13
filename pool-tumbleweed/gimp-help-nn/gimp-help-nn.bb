SUMMARY = "Norwegian Nynorsk Help System Data for GIMP"
DESCRIPTION = "GIMP-Help is a help system designed for use with the internal GIMP help \
browser, external Web browser and HTML renderers, and human eyeballs. \
 \
This package provides Norwegian Nynorsk data for gimp-help."
LICENSE = "GFDL-1.2"

PV = "2.10.0"

RPM_NAME = "gimp-help-nn-2.10.0-2.5.noarch.rpm"
RPM_HASH = "7c8d0e5f722186101d149293d42bacead962dc0b628978f09bfdc0f4a45e3990d18b9d446c9fb54cfb5c3f18964823125987a299a980fa95623a6e941af902d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gimp-help-nn \
locale(gimp-help:nn)"

RDEPENDS:${PN} += "gimp-help"

inherit rpm

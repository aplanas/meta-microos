SUMMARY = "Spanish Help System Data for GIMP"
DESCRIPTION = "GIMP-Help is a help system designed for use with the internal GIMP help \
browser, external Web browser and HTML renderers, and human eyeballs. \
 \
This package provides Spanish data for gimp-help."
LICENSE = "GFDL-1.2"

PV = "2.10.0"

RPM_NAME = "gimp-help-es-2.10.0-2.5.noarch.rpm"
RPM_HASH = "77a8a7a9f5790f6185658b8fe9766151ce325ad0816d0cf5c188aeb319b25b8b03233d34352aca7d75bfac6f0fc98f1dfaa416871d8244522a2e51be52d07079"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gimp-help-es \
locale(gimp-help:es)"

RDEPENDS:${PN} += "gimp-help"

inherit rpm

SUMMARY = "Croatian Help System Data for GIMP"
DESCRIPTION = "GIMP-Help is a help system designed for use with the internal GIMP help \
browser, external Web browser and HTML renderers, and human eyeballs. \
 \
This package provides Croatian data for gimp-help."
LICENSE = "GFDL-1.2"

PV = "2.10.0"

RPM_NAME = "gimp-help-hr-2.10.0-2.5.noarch.rpm"
RPM_HASH = "25d83b208eb7df3d9da4adcd2985c22942497501aab181ac321ffa78733ee4a24ae4b46af776970101d20259668be21338e63a649540f45a5b1c7e938f07fe27"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gimp-help-hr \
locale(gimp-help:hr)"

RDEPENDS:${PN} += "gimp-help"

inherit rpm

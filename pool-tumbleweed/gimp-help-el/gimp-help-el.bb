SUMMARY = "Greek Help System Data for GIMP"
DESCRIPTION = "GIMP-Help is a help system designed for use with the internal GIMP help \
browser, external Web browser and HTML renderers, and human eyeballs. \
 \
This package provides Greek data for gimp-help."
LICENSE = "GFDL-1.2"

PV = "2.10.0"

RPM_NAME = "gimp-help-el-2.10.0-2.5.noarch.rpm"
RPM_HASH = "85fdec3b17389bb0a2de2b0a01eee6f99c7edae05f81be2b326e707329a1c0272fea0b98bdd577580e17b9620e68e1bb19d2491c590c1fe22eec07e3b1d3c885"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gimp-help-el \
locale(gimp-help:el)"

RDEPENDS:${PN} += "gimp-help"

inherit rpm

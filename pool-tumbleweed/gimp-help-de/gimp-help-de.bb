SUMMARY = "German Help System Data for GIMP"
DESCRIPTION = "GIMP-Help is a help system designed for use with the internal GIMP help \
browser, external Web browser and HTML renderers, and human eyeballs. \
 \
This package provides German data for gimp-help."
LICENSE = "GFDL-1.2"

PV = "2.10.0"

RPM_NAME = "gimp-help-de-2.10.0-2.5.noarch.rpm"
RPM_HASH = "f07246d5b84a5d7df6833f5727225d33266ec60b1ba268cdf3828ce8cac457af2a7289dbb42a48acefc529296b4941109dc815e7da97c4ad9e8071175238ecd6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gimp-help-de \
locale(gimp-help:de)"

RDEPENDS:${PN} += "gimp-help"

inherit rpm

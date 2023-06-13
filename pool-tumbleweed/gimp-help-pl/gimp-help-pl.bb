SUMMARY = "Polish Help System Data for GIMP"
DESCRIPTION = "GIMP-Help is a help system designed for use with the internal GIMP help \
browser, external Web browser and HTML renderers, and human eyeballs. \
 \
This package provides Polish data for gimp-help."
LICENSE = "GFDL-1.2"

PV = "2.10.0"

RPM_NAME = "gimp-help-pl-2.10.0-2.5.noarch.rpm"
RPM_HASH = "356f76a06e3b0dee7b758c45bb4f687cea77b05c14550f30bad8beddcceff10c8e704dccb324d38cf3df19be4604095cd2318b21d3e0129ebe07fe0404ce7988"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gimp-help-pl \
locale(gimp-help:pl)"

RDEPENDS:${PN} += "gimp-help"

inherit rpm

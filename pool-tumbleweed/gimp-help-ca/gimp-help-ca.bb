SUMMARY = "Catalanian Help System Data for GIMP"
DESCRIPTION = "GIMP-Help is a help system designed for use with the internal GIMP help \
browser, external Web browser and HTML renderers, and human eyeballs. \
 \
This package provides Catalanian data for gimp-help."
LICENSE = "GFDL-1.2"

PV = "2.10.0"

RPM_NAME = "gimp-help-ca-2.10.0-2.5.noarch.rpm"
RPM_HASH = "e9d1091270dcfeb386d7fdf14e16519fcec0b8d8b3f163ce8b61ea7f7a07c557f9fcd4d2f9e4819aea3295eef99d9836177d9a90dcd56c73c3cdfdde06fbb741"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gimp-help-ca \
locale(gimp-help:ca)"
RDEPENDS:${PN} += "gimp-help"

inherit rpm

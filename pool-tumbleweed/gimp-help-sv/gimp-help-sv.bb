SUMMARY = "Swedish Help System Data for GIMP"
DESCRIPTION = "GIMP-Help is a help system designed for use with the internal GIMP help \
browser, external Web browser and HTML renderers, and human eyeballs. \
 \
This package provides Swedish data for gimp-help."
LICENSE = "GFDL-1.2"

PV = "2.10.0"

RPM_NAME = "gimp-help-sv-2.10.0-2.5.noarch.rpm"
RPM_HASH = "4672d3b522ba014ff237eb43b37314d341c0cc451b38712b9acebd6f0cbabf6377a24365239c9b62834b5b3117953e1876053bd27e86c004e5084eef61b63ca1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gimp-help-sv \
locale-gimp-help-sv"

RDEPENDS:${PN} += "gimp-help"

inherit rpm

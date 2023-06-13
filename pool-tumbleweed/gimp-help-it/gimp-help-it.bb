SUMMARY = "Italian Help System Data for GIMP"
DESCRIPTION = "GIMP-Help is a help system designed for use with the internal GIMP help \
browser, external Web browser and HTML renderers, and human eyeballs. \
 \
This package provides Italian data for gimp-help."
LICENSE = "GFDL-1.2"

PV = "2.10.0"

RPM_NAME = "gimp-help-it-2.10.0-2.5.noarch.rpm"
RPM_HASH = "8aa395e028a55929aab5cbadcd20958fb62047d76aeb4954db352370260a4c858eed9d4243053f4dda08bf1902df8aa21af4159770e0b6681641bb1e90a5cfde"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gimp-help-it \
locale(gimp-help:it)"

RDEPENDS:${PN} += "gimp-help"

inherit rpm

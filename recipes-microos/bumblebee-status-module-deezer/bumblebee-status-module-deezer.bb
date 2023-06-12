SUMMARY = "Widget for deezer"
DESCRIPTION = "Displays the current song being played in deezer and provides \
some media control bindings."
LICENSE = "MIT"

PV = "2.1.5"

RPM_NAME = "bumblebee-status-module-deezer-2.1.5-3.3.noarch.rpm"
RPM_HASH = "340074a242d51a45124c95cf656f39e9cd5653db969b29390b2e773dada19ccea78e7ca0efaf4fb48f58c189cb2420fe62259e609bbd92d3fef9f560f2008686"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bumblebee-status-module-deezer"
RDEPENDS:${PN} += "bumblebee-status \
python3-dbus-python"

inherit rpm

SUMMARY = "Widget for deadbeef"
DESCRIPTION = "Displays the current song being played in DeaDBeeF and provides \
some media control bindings."
LICENSE = "MIT"

PV = "2.1.5"

RPM_NAME = "bumblebee-status-module-deadbeef-2.1.5-3.3.aarch64.rpm"
RPM_HASH = "c24a81cec89401c6d1338d3c60aca103e6e775fd3d20b060f6ec73e28201728b73516409ffeab5b90da0a3945d3feeb7416891d5e20a09bdf5c8eeebfd6a7b0b"

RPROVIDES:${PN} += "bumblebee-status-module-deadbeef bumblebee-status-module-deadbeef(aarch-64)"
RDEPENDS:${PN} += "bumblebee-status deadbeef"

inherit rpm

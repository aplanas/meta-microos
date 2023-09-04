SUMMARY = "Relay server for syncthing"
DESCRIPTION = "Syncthing requires relay servers for NAT traversal. This package \
contains the necessary files for setting up a relay server, either \
joined to the syncthing relay pool or private."
LICENSE = "MPL-2.0"

PV = "1.23.7"

RPM_NAME = "syncthing-relaysrv-1.23.7-1.1.aarch64.rpm"
RPM_HASH = "30de775816a48be3f5fcc831322ed70b98ba7ca75d6b3cd387e7d3c53aebc42876960cf7258ba02205f169fbf7e1d4d01f385baeb7e6294def4d8a8ea74609fb"

RPROVIDES:${PN} += "syncthing-relaysrv"

RDEPENDS:${PN} += "/usr/bin/sh \
pwdutils"

inherit rpm

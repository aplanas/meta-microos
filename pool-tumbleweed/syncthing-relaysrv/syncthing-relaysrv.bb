SUMMARY = "Relay server for syncthing"
DESCRIPTION = "Syncthing requires relay servers for NAT traversal. This package \
contains the necessary files for setting up a relay server, either \
joined to the syncthing relay pool or private."
LICENSE = "MPL-2.0"

PV = "1.24.0"

RPM_NAME = "syncthing-relaysrv-1.24.0-1.1.aarch64.rpm"
RPM_HASH = "50977ee7662a7b3f99ce809604102db7195f117ac1f99445d7262223203066736f767481a8a81f1692ec10fe4a1cf17eacbbb73d0da12f6eeecc906998ca4d51"

RPROVIDES:${PN} += "syncthing-relaysrv"

RDEPENDS:${PN} += "/usr/bin/sh \
pwdutils"

inherit rpm

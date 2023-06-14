SUMMARY = "Relay server for syncthing"
DESCRIPTION = "Syncthing requires relay servers for NAT traversal. This package \
contains the necessary files for setting up a relay server, either \
joined to the syncthing relay pool or private."
LICENSE = "MPL-2.0"

PV = "1.23.4"

RPM_NAME = "syncthing-relaysrv-1.23.4-1.2.aarch64.rpm"
RPM_HASH = "d2fef556131fa8cfb538fbd56edd24ef30e9120b9127ac50441401e16d20b8c4c0f72de1312f0770c17bbb60b9e4a448ca1bfd797319471ec38ef889deb9a665"

RPROVIDES:${PN} += "syncthing-relaysrv"

RDEPENDS:${PN} += "/bin/sh \
pwdutils"

inherit rpm

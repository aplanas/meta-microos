SUMMARY = "Relay server for syncthing"
DESCRIPTION = "Syncthing requires relay servers for NAT traversal. This package \
contains the necessary files for setting up a relay server, either \
joined to the syncthing relay pool or private."
LICENSE = "MPL-2.0"

PV = "1.23.6"

RPM_NAME = "syncthing-relaysrv-1.23.6-1.1.aarch64.rpm"
RPM_HASH = "3f0ae720eaa6f763969cdcf4f9a136ea2b48ebd2248a779a30869d124360f74b2488bc4fe16e5951078a02154dfe509cccfd6684744fb395bb0f1a5e03392ec3"

RPROVIDES:${PN} += "syncthing-relaysrv"

RDEPENDS:${PN} += "/usr/bin/sh \
pwdutils"

inherit rpm

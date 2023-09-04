SUMMARY = "Continuous File Synchronisation"
DESCRIPTION = "Syncthing is an application that synchronises files across multiple \
devices. This means the creation, modification or deletion of files \
on one machine will automatically be replicated to other devices."
LICENSE = "MPL-2.0"

PV = "1.23.7"

RPM_NAME = "syncthing-1.23.7-1.1.aarch64.rpm"
RPM_HASH = "d3a47fbcc5abc15db2f839061f37feb28dcc3c207fe10637373c1ea6680d9d5396b1d5e9fff26e8b34575e667dd8c578017c7b305189cba8bfa8ba83b06b50e6"

RPROVIDES:${PN} += "syncthing"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm

SUMMARY = "Nextcloud sync client - Command-line utility"
DESCRIPTION = "The Nextcloud Desktop Client is a tool to synchronise files from \
the Nextcloud Server with your computer. \
 \
This package provides Nextcloud's command-line sync utility."
LICENSE = "GPL-2.0-or-later & LGPL-3.0-or-later"

PV = "3.9.3"

RPM_NAME = "nextcloud-cli-3.9.3-1.1.aarch64.rpm"
RPM_HASH = "69aaf5b9c81a7e96a61cf78d8263638d825c7fa4e8ab0a1c94c7057e1f614643db51f75f35da8262732ce50047ce057a93c6a89cdefc55ad11fcfb1e7b2d53ee"

RPROVIDES:${PN} += "config-nextcloud-cli \
nextcloud-cli"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Network.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libnextcloud-csync.so.0 \
libnextcloudsync.so.0 \
libstdc++.so.6"

inherit rpm

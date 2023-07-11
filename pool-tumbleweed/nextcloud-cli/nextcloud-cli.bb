SUMMARY = "Nextcloud sync client - Command-line utility"
DESCRIPTION = "The Nextcloud Desktop Client is a tool to synchronise files from \
the Nextcloud Server with your computer. \
 \
This package provides Nextcloud's command-line sync utility."
LICENSE = "GPL-2.0-or-later & LGPL-3.0-or-later"

PV = "3.9.0"

RPM_NAME = "nextcloud-cli-3.9.0-3.1.aarch64.rpm"
RPM_HASH = "2b630b4ace51a3f77e1243184845955abd27f251cab50ab64d8dac536beec083b3b707c35c2ef14bc28fe5a45d52be108eb0172805c50d5c0eecb8f586108e83"

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

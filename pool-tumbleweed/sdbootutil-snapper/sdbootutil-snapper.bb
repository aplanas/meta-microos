SUMMARY = "plugin script for snapper"
DESCRIPTION = "Plugin scripts for snapper to handle BLS config files"
LICENSE = "MIT"

PV = "1+git20230814.38973c7"

RPM_NAME = "sdbootutil-snapper-1+git20230814.38973c7-1.1.aarch64.rpm"
RPM_HASH = "4a41b74a1893d3b8aea6eb8303e444fc7f1b2054d96f7bdeef3bc9c5c100413995bfda8269e48f73f1384f4faf1337fb7a0e06153d1a2b47f9008b56366750de"

RPROVIDES:${PN} += "sdbootutil-snapper"

RDEPENDS:${PN} += "/usr/bin/bash \
btrfsprogs \
sdbootutil \
snapper"

inherit rpm

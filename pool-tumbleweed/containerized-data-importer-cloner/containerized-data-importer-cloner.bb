SUMMARY = "Cloner for host assisted cloning"
DESCRIPTION = "Source and Target cloner image for host assisted cloning"
LICENSE = "Apache-2.0"

PV = "1.56.0"

RPM_NAME = "containerized-data-importer-cloner-1.56.0-1.5.aarch64.rpm"
RPM_HASH = "aa5e0c0a6ff36ed1daaa98654edb0327d10b5ed8a425fdfc686e4d0faf71c6ddccf79d891846afe1c5ce9cd6759cf1a2289651cc560c9a768e36dbdcc5df390d"

RPROVIDES:${PN} += "containerized-data-importer-cloner"

RDEPENDS:${PN} += "/usr/bin/bash \
libc.so.6"

inherit rpm

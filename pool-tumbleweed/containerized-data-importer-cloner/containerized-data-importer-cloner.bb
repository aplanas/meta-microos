SUMMARY = "Cloner for host assisted cloning"
DESCRIPTION = "Source and Target cloner image for host assisted cloning"
LICENSE = "Apache-2.0"

PV = "1.56.0"

RPM_NAME = "containerized-data-importer-cloner-1.56.0-2.1.aarch64.rpm"
RPM_HASH = "22b3faf2d96212727f31a073d7cbe0ec96aada1e7bbec70b2daff5ad6f540f0aedafd98570318afa5ca83729975b9a54c306c5a4577de9ce72edeae556f4cae3"

RPROVIDES:${PN} += "containerized-data-importer-cloner"

RDEPENDS:${PN} += "/usr/bin/bash \
libc.so.6"

inherit rpm

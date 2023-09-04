SUMMARY = "CDI containers meta information (build service)"
DESCRIPTION = "The package provides meta information that is used during the build of \
the CDI container images."
LICENSE = "Apache-2.0"

PV = "1.57.0"

RPM_NAME = "obs-service-cdi_containers_meta-1.57.0-1.1.aarch64.rpm"
RPM_HASH = "d4b808f89061904fc7ce0233b5a3f60ee1b5b6deebd2680898fb19a1cb7ebbf5aa95d00c531d717e6cdc4ad63dbdb4d116cf57b8dcf2de2e4da04c9defb4c63a"

RPROVIDES:${PN} += "obs-service-cdi-containers-meta"

RDEPENDS:${PN} += "/usr/bin/bash"

inherit rpm

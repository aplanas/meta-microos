SUMMARY = "CDI containers meta information (build service)"
DESCRIPTION = "The package provides meta information that is used during the build of \
the CDI container images."
LICENSE = "Apache-2.0"

PV = "1.56.0"

RPM_NAME = "obs-service-cdi_containers_meta-1.56.0-1.5.aarch64.rpm"
RPM_HASH = "996eef040b8fb5e127e937f0510add727000b2987d078a7080ede795e57e7889afc0fcf609ebe544395ea6457e21e1a1f468adf5c6f8938294229ca91f867b4c"

RPROVIDES:${PN} += "obs-service-cdi-containers-meta"

RDEPENDS:${PN} += "/usr/bin/bash"

inherit rpm

SUMMARY = "CDI containers meta information (build service)"
DESCRIPTION = "The package provides meta information that is used during the build of \
the CDI container images."
LICENSE = "Apache-2.0"

PV = "1.56.0"

RPM_NAME = "obs-service-cdi_containers_meta-1.56.0-2.1.aarch64.rpm"
RPM_HASH = "664712c18fd2fd14b0472c3e328f0f9dbfa81cbc304dc87688a74a85fbcc5ca5abeae3cf9208e1463f9e6de41f607405482f4fdb90de0bcf386a70eaac22c4f6"

RPROVIDES:${PN} += "obs-service-cdi-containers-meta"

RDEPENDS:${PN} += "/usr/bin/bash"

inherit rpm

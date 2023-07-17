SUMMARY = "Kubevirt containers meta information (build service)"
DESCRIPTION = "The package provides meta information that is used during the build of \
the Kubevirt container images."
LICENSE = "Apache-2.0"

PV = "0.59.2"

RPM_NAME = "obs-service-kubevirt_containers_meta-0.59.2-2.1.aarch64.rpm"
RPM_HASH = "e3b2e20afab84ab604b7dbe16bdfc21509530175a914d186e3080033f9f93ebe7c5a2b30dc2cc7e2fab548336fe734ee1eadb97bd945aef1baa62c0c91d0413d"

RPROVIDES:${PN} += "obs-service-kubevirt-containers-meta"

RDEPENDS:${PN} += "/usr/bin/bash"

inherit rpm

SUMMARY = "Kubevirt containers meta information (build service)"
DESCRIPTION = "The package provides meta information that is used during the build of \
the Kubevirt container images."
LICENSE = "Apache-2.0"

PV = "1.0.0"

RPM_NAME = "obs-service-kubevirt_containers_meta-1.0.0-3.1.aarch64.rpm"
RPM_HASH = "ed5c40b40a89daeddd8a7bcc00c81482810cf1b2e36afb7c4b846eedd9e27265beb0015d224f3d419549e036c2f6854e14db8c5cff56f738a31de1f81d89b77a"

RPROVIDES:${PN} += "obs-service-kubevirt-containers-meta"

RDEPENDS:${PN} += "/usr/bin/bash"

inherit rpm

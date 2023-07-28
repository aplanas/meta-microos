SUMMARY = "Kubevirt containers meta information (build service)"
DESCRIPTION = "The package provides meta information that is used during the build of \
the Kubevirt container images."
LICENSE = "Apache-2.0"

PV = "1.0.0"

RPM_NAME = "obs-service-kubevirt_containers_meta-1.0.0-2.1.aarch64.rpm"
RPM_HASH = "e59c58a98dee3a7547589777afe5e0d4b1b0cc87cbd0314783086781f304a0a31bc77538d21bb445ace5d5adbe6cb3a9a6ca12deb9e445fb7a8c3903a924bd88"

RPROVIDES:${PN} += "obs-service-kubevirt-containers-meta"

RDEPENDS:${PN} += "/usr/bin/bash"

inherit rpm

SUMMARY = "Kubevirt containers meta information (build service)"
DESCRIPTION = "The package provides meta information that is used during the build of \
the Kubevirt container images."
LICENSE = "Apache-2.0"

PV = "1.0.0"

RPM_NAME = "obs-service-kubevirt_containers_meta-1.0.0-6.1.aarch64.rpm"
RPM_HASH = "0cb8aaac0d4bbdf9b8cce4b208cb1d2b0b5d7ca3e663b07bdacbc8f91871f63c78290829bf7aa67cf9a5bfa34fc9f942a217b208aa676314b2dc29a414a14e4f"

RPROVIDES:${PN} += "obs-service-kubevirt-containers-meta"

RDEPENDS:${PN} += "/usr/bin/bash"

inherit rpm

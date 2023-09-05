SUMMARY = "Kubevirt containers meta information (build service)"
DESCRIPTION = "The package provides meta information that is used during the build of \
the Kubevirt container images."
LICENSE = "Apache-2.0"

PV = "1.0.0"

RPM_NAME = "obs-service-kubevirt_containers_meta-1.0.0-7.1.aarch64.rpm"
RPM_HASH = "84ad045598fec094b70c5e2f5d126fbd29c73f67c4ad11fe8f6530d9fb8e72b475b797a0b997084bfa519ad686cb0b19eb5c6102c380735f513f81b38bc0906a"

RPROVIDES:${PN} += "obs-service-kubevirt-containers-meta"

RDEPENDS:${PN} += "/usr/bin/bash"

inherit rpm

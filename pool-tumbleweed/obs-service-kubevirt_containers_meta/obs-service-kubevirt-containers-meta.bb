SUMMARY = "Kubevirt containers meta information (build service)"
DESCRIPTION = "The package provides meta information that is used during the build of \
the Kubevirt container images."
LICENSE = "Apache-2.0"

PV = "0.59.0"

RPM_NAME = "obs-service-kubevirt_containers_meta-0.59.0-3.2.aarch64.rpm"
RPM_HASH = "f93f6d0169d9eaca84b3340d0707fb4ff4a0526a534b62c01c6f220b5db059068eb1ea0271746c2f665fe64ca3d72369c08aa66c0952961c52a0ef010f8235ff"

RPROVIDES:${PN} += "obs-service-kubevirt-containers-meta"

RDEPENDS:${PN} += "/bin/bash"

inherit rpm

SUMMARY = "Kubernetes pause image files"
DESCRIPTION = "This package contains the files needed for building the pause Docker image used \
by a Kubernetes cluster."
LICENSE = "Apache-2.0"

PV = "1.0.0"

RPM_NAME = "kubernetes-node-image-pause-1.0.0-1.17.aarch64.rpm"
RPM_HASH = "6c7d548a5d13498f57d733711e7493a73b083419781bddde4c577bec0a835f828760398d586c5087049b31dd28da5002f454b52e58ca9c9e962cbde40d857bc7"

RPROVIDES:${PN} += "kubernetes-node-image-pause \
kubernetes-node-image-pause(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/mkdir \
/usr/bin/touch \
fillup"

inherit rpm

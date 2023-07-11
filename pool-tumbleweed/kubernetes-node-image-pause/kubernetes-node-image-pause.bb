SUMMARY = "Kubernetes pause image files"
DESCRIPTION = "This package contains the files needed for building the pause Docker image used \
by a Kubernetes cluster."
LICENSE = "Apache-2.0"

PV = "1.0.0"

RPM_NAME = "kubernetes-node-image-pause-1.0.0-1.18.aarch64.rpm"
RPM_HASH = "99762bf394036d66c54bf1191e81cdf78ea0e1163073ec303b089580844922654718ca4a2e096dffa90d61b2a76fec9b78b1ec4391dad21d763a898bad9039fc"

RPROVIDES:${PN} += "kubernetes-node-image-pause"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
fillup"

inherit rpm

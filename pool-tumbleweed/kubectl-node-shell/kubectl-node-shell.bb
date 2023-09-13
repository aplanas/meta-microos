SUMMARY = "Exec into node via kubectl"
DESCRIPTION = "Start a root shell in the node's host OS running. \
(formerly known as kubectl-enter)"
LICENSE = "Apache-2.0"

PV = "1.8.0"

RPM_NAME = "kubectl-node-shell-1.8.0-1.1.noarch.rpm"
RPM_HASH = "b985b0a61f278e67e8fb62a13b9e4fe331642cde81455cad88251d6c2f16fef73b66658f55238852120cac2069a5b89626f413143f35cc411843a4a109f61298"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kubectl-node-shell"

RDEPENDS:${PN} += "/usr/bin/sh \
bash"

inherit rpm

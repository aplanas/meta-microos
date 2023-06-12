SUMMARY = "Exec into node via kubectl"
DESCRIPTION = "Start a root shell in the node's host OS running. \
(formerly known as kubectl-enter)"
LICENSE = "Apache-2.0"

PV = "1.7.0"

RPM_NAME = "kubectl-node-shell-1.7.0-1.1.noarch.rpm"
RPM_HASH = "01668901e74dfb82ded9c44083354b50f79e8d99622a6e41f08ca14e1aeb0a6f540506e0620344ba620693067ac096290914eedf361451d90b3135c2c04e4f0c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kubectl-node-shell"
RDEPENDS:${PN} += "/usr/bin/sh \
bash"

inherit rpm

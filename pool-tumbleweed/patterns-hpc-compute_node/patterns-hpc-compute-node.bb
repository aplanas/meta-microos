SUMMARY = "HPC Basic Compute Node"
DESCRIPTION = "A compute node comprises of a minimal software image and mainly runs simulation programs. Services on this node should be reduced to a bare minimum and the node *must* be installed in a automatic manner. \
The pattern 'HPC Modularized libraries' should also be installed."
LICENSE = "MIT"

PV = "20190218"

RPM_NAME = "patterns-hpc-compute_node-20190218-7.1.aarch64.rpm"
RPM_HASH = "3e573ef12f0ec0cdafbc3b7520a3b45ed40135642cf0a4eb67c800f73b6d60d2d51d311d2f7b1d2a218212db6e7692ef57b5a530d8a70d5bf0ec02951077dbb4"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-visible- \
patterns-hpc-compute-node"

RDEPENDS:${PN} += "iputils \
nfs-client \
openssh \
sudo"

inherit rpm

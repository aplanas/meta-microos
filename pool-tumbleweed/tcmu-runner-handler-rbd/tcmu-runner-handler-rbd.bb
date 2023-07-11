SUMMARY = "Ceph RBD handler for tcmu-runner"
DESCRIPTION = "This package contains the Ceph RADOS Block Device (RBD) handler for \
tcmu-runner, which allows for LIO/tcmu logical units to be backed by \
RBD images."
LICENSE = "Apache-2.0"

PV = "1.6.0"

RPM_NAME = "tcmu-runner-handler-rbd-1.6.0-1.4.aarch64.rpm"
RPM_HASH = "0ad7df37ec8e9f9ac5e422b49d4603dc510f9b16812a5b0b26eae2a984ba65f057cf9d3dfee25e45761a361832ea67325dd4b296f83593aede5ef3a016b084dc"

RPROVIDES:${PN} += "tcmu-runner-handler-rbd"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
librbd.so.1 \
libtcmalloc.so.4 \
tcmu-runner"

inherit rpm

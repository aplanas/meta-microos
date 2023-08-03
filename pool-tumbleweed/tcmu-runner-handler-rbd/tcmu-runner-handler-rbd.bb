SUMMARY = "Ceph RBD handler for tcmu-runner"
DESCRIPTION = "This package contains the Ceph RADOS Block Device (RBD) handler for \
tcmu-runner, which allows for LIO/tcmu logical units to be backed by \
RBD images."
LICENSE = "Apache-2.0"

PV = "1.6.2"

RPM_NAME = "tcmu-runner-handler-rbd-1.6.2-1.1.aarch64.rpm"
RPM_HASH = "c950beaae06ec744968b8264d5008bc5ea52fed25e5fe60d7a1328d8ebdbe158c81d5bb80c3ad843b59e156bd9517827b19a9b356542af65bb67ec8de4081ae3"

RPROVIDES:${PN} += "tcmu-runner-handler-rbd"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
librbd.so.1 \
libtcmalloc.so.4 \
tcmu-runner"

inherit rpm

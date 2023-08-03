SUMMARY = "Ceph ZBC handler for tcmu-runner"
DESCRIPTION = "This package contains the Ceph RADOS ZBC disc emulation, using a \
file backstore in tcmu-runner."
LICENSE = "Apache-2.0"

PV = "1.6.2"

RPM_NAME = "tcmu-runner-handler-zbc-1.6.2-1.1.aarch64.rpm"
RPM_HASH = "25cbe24ac283721a679cf2f0c23631608e48714e135f159a9e0f0b81524d1b4885c2bc10e8b67166e1e3858fca3ec87b4d9d1a3326a64a49fc2cb2b94f42e306"

RPROVIDES:${PN} += "tcmu-runner-handler-zbc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libtcmalloc.so.4 \
tcmu-runner"

inherit rpm

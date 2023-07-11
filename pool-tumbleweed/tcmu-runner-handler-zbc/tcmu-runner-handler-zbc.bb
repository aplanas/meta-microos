SUMMARY = "Ceph ZBC handler for tcmu-runner"
DESCRIPTION = "This package contains the Ceph RADOS ZBC disc emulation, using a \
file backstore in tcmu-runner."
LICENSE = "Apache-2.0"

PV = "1.6.0"

RPM_NAME = "tcmu-runner-handler-zbc-1.6.0-1.4.aarch64.rpm"
RPM_HASH = "cafb08dcaf9170b15443b824a85dd9d65e1f557dabf7f15fae533569b769a9eeb75dad5828d504f76bd58c5bdff2b596d96a75b85176be51b4d921d3640480b3"

RPROVIDES:${PN} += "tcmu-runner-handler-zbc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libtcmalloc.so.4 \
tcmu-runner"

inherit rpm

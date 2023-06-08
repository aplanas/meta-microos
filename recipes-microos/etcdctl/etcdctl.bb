SUMMARY = "A simple command line client for etcd"
DESCRIPTION = "A command line client for etcd. It can be used in scripts or for administrators \
to explore an etcd cluster."
LICENSE = "Apache-2.0"

PV = "3.5.8"

RPM_NAME = "etcdctl-3.5.8-1.1.aarch64.rpm"
RPM_HASH = "e0ae841815f07842b988e3ae986d5063aa4968ca1116bf88279834bef012e8138785b960151e2f2d04309a448afcec8674e2abafe3049f728c22de9f1b94ac8e"

RPROVIDES:${PN} += "etcdctl etcdctl(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm

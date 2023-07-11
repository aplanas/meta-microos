SUMMARY = "A simple command line client for etcd"
DESCRIPTION = "A command line administration utility for etcd. \
It's designed to operate directly on etcd data files. \
 \
For operations over a network, please use `etcdctl`."
LICENSE = "Apache-2.0"

PV = "3.5.9"

RPM_NAME = "etcdutl-3.5.9-1.2.aarch64.rpm"
RPM_HASH = "d73fff3dd6dcdc56605b4c9bd83a596c9fc4de9586116e4d1cf16a6dc5c91ba0261c1077bd36c4c82099094a199559f3820256a44a5287f9c8e72de5f1817282"

RPROVIDES:${PN} += "etcdutl"

RDEPENDS:${PN} += ""

inherit rpm

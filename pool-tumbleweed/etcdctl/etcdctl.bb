SUMMARY = "A simple command line client for etcd"
DESCRIPTION = "A command line client for etcd. It can be used in scripts or for administrators \
to explore an etcd cluster."
LICENSE = "Apache-2.0"

PV = "3.5.9"

RPM_NAME = "etcdctl-3.5.9-1.2.aarch64.rpm"
RPM_HASH = "4b9ef099d20c35f21773de25191102ff505c38a5df098eaea29a523b882f6baf6e6c75798b754424e14eef91f55d0db830b4fe75f3d9ef3737da9a56b46c6ece"

RPROVIDES:${PN} += "etcdctl"

RDEPENDS:${PN} += ""

inherit rpm

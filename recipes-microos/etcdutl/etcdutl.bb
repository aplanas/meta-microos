SUMMARY = "A simple command line client for etcd"
DESCRIPTION = "A command line administration utility for etcd. \
It's designed to operate directly on etcd data files. \
 \
For operations over a network, please use `etcdctl`."
LICENSE = "Apache-2.0"

PV = "3.5.8"

RPM_NAME = "etcdutl-3.5.8-1.1.aarch64.rpm"
RPM_HASH = "87ca1d7d3b6626180445f74eca1da8d7cd01e9eee0680bbd121942f90c6c448a87f56f5770a027f64cb571d1102b19a7c4136000c139c19bdda3a55c4e470b81"

RPROVIDES:${PN} += "etcdutl etcdutl(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm

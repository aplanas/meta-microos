SUMMARY = "A simple command line client for etcd"
DESCRIPTION = "A command line administration utility for etcd. \
It's designed to operate directly on etcd data files. \
 \
For operations over a network, please use `etcdctl`."
LICENSE = "Apache-2.0"

PV = "3.5.9"

RPM_NAME = "etcdutl-3.5.9-1.1.aarch64.rpm"
RPM_HASH = "62cf9a1ca4c8e42a8cebd27c9cb6eba6d217fdfe19a6c30550a23265fecbffb2b2888ccc723b9a340d70d213af6f50b1f94c528ca9008d9fc736d724b94fe7e9"

RPROVIDES:${PN} += "etcdutl"

RDEPENDS:${PN} += ""

inherit rpm

SUMMARY = "Etcd and etcdtl for k8s image"
DESCRIPTION = "etcd is a distributed, consistent key-value store for shared configuration and \
service discovery. This package contains different versions of etcd and \
etcdctl for the kubernetes container image."
LICENSE = "Apache-2.0"

PV = "3.5.6"

RPM_NAME = "etcd-for-k8s1.25-3.5.6-1.2.aarch64.rpm"
RPM_HASH = "30376903b324bc58ae2f1dfb389c3e0d278ac073ffedf6248a021d4fb64761a25b15ec6e69659f6656c86f26c05dbe085d4961cf42a3127fc7b869df4e23f3b7"

RPROVIDES:${PN} += "etcd-for-k8s etcd-for-k8s1.25 etcd-for-k8s1.25(aarch-64)"
RDEPENDS:${PN} += "/bin/bash libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm

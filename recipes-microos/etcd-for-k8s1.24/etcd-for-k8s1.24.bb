SUMMARY = "Etcd and etcdtl for k8s image"
DESCRIPTION = "etcd is a distributed, consistent key-value store for shared configuration and \
service discovery. This package contains different versions of etcd and \
etcdctl for the kubernetes container image."
LICENSE = "Apache-2.0"

PV = "3.5.6"

RPM_NAME = "etcd-for-k8s1.24-3.5.6-1.3.aarch64.rpm"
RPM_HASH = "ca827567ca9e4fb31f93433a5ce8d85ee36f873be4986ddafc341a4fd5ff5c43ccfa3efea019ffae431a04ebfa6f8836c0dfdb5960b899e24987df18762a4b42"

RPROVIDES:${PN} += "etcd-for-k8s etcd-for-k8s1.24 etcd-for-k8s1.24(aarch-64)"
RDEPENDS:${PN} += "/bin/bash libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm

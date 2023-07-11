SUMMARY = "Etcd and etcdtl for k8s image"
DESCRIPTION = "etcd is a distributed, consistent key-value store for shared configuration and \
service discovery. This package contains different versions of etcd and \
etcdctl for the kubernetes container image."
LICENSE = "Apache-2.0"

PV = "3.5.7"

RPM_NAME = "etcd-for-k8s1.27-3.5.7-1.2.aarch64.rpm"
RPM_HASH = "1533edf0e6f3a1242a732f256b1338a74047af74900193b7e11de233de8c6859e16d236d9959d4774cef094d5d5bca568d0fa027f4189a9767cac93b959dd02b"

RPROVIDES:${PN} += "etcd-for-k8s \
etcd-for-k8s1.27"

RDEPENDS:${PN} += "/usr/bin/bash \
libc.so.6"

inherit rpm

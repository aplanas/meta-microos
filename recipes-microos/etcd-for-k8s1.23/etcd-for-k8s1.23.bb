SUMMARY = "Etcd and etcdtl for k8s image"
DESCRIPTION = "etcd is a distributed, consistent key-value store for shared configuration and \
service discovery. This package contains different versions of etcd and \
etcdctl for the kubernetes container image."
LICENSE = "Apache-2.0"

PV = "3.5.6"

RPM_NAME = "etcd-for-k8s1.23-3.5.6-1.3.aarch64.rpm"
RPM_HASH = "1695498dc54eb0cee676aa0d8d79c6ea2134a4f503af0c908cafbcf12f434f3bae7cc6fd218c722996c46a6cf26f26cf2b0b84f232dddb55c2b4dca10a4885c1"

RPROVIDES:${PN} += "etcd-for-k8s etcd-for-k8s1.23 etcd-for-k8s1.23(aarch-64)"
RDEPENDS:${PN} += "/bin/bash libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm

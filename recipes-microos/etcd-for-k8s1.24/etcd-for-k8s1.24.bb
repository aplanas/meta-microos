SUMMARY = "Etcd and etcdtl for k8s image"
DESCRIPTION = "etcd is a distributed, consistent key-value store for shared configuration and \
service discovery. This package contains different versions of etcd and \
etcdctl for the kubernetes container image."
LICENSE = "Apache-2.0"

PV = "3.5.6"

RPM_NAME = "etcd-for-k8s1.24-3.5.6-1.4.aarch64.rpm"
RPM_HASH = "8c202d68d2271a7ba5a5fe28885e923de5828b9b5f166cbbdef782dcdd10a071afe8f3a426b3c6b60dbf24902801c3bf0555679cdbcf8ee1bc3ee9b7b3533eb7"

RPROVIDES:${PN} += "etcd-for-k8s etcd-for-k8s1.24 etcd-for-k8s1.24(aarch-64)"
RDEPENDS:${PN} += "/bin/bash libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm

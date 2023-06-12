SUMMARY = "Etcd and etcdtl for k8s image"
DESCRIPTION = "etcd is a distributed, consistent key-value store for shared configuration and \
service discovery. This package contains different versions of etcd and \
etcdctl for the kubernetes container image."
LICENSE = "Apache-2.0"

PV = "3.5.6"

RPM_NAME = "etcd-for-k8s1.26-3.5.6-1.3.aarch64.rpm"
RPM_HASH = "4e0beccb7577c7404d46a7d1242e588049ef303235235b60adc810562d34b5bba3022c11e5a88fde94aadf5b79f4019260d18cf20c5982991391a2a6d6927dde"

RPROVIDES:${PN} += "etcd-for-k8s \
etcd-for-k8s1.26 \
etcd-for-k8s1.26(aarch-64)"
RDEPENDS:${PN} += "/bin/bash \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm

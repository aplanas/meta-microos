SUMMARY = "Etcd and etcdtl for k8s image"
DESCRIPTION = "etcd is a distributed, consistent key-value store for shared configuration and \
service discovery. This package contains different versions of etcd and \
etcdctl for the kubernetes container image."
LICENSE = "Apache-2.0"

PV = "3.5.6"

RPM_NAME = "etcd-for-k8s1.26-3.5.6-1.2.aarch64.rpm"
RPM_HASH = "fabcefb128f52bf031b13bf99b0d33c5635ed77dbd96aa7f7d5dcafe81bc2bc95ac50b06ac422a7e1bd1b52c4ad3492536361f70af3b7e7e5ab272620833701b"

RPROVIDES:${PN} += "etcd-for-k8s etcd-for-k8s1.26 etcd-for-k8s1.26(aarch-64)"
RDEPENDS:${PN} += "/bin/bash libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm

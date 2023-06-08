SUMMARY = "Etcd and etcdtl for k8s image"
DESCRIPTION = "etcd is a distributed, consistent key-value store for shared configuration and \
service discovery. This package contains different versions of etcd and \
etcdctl for the kubernetes container image."
LICENSE = "Apache-2.0"

PV = "3.5.0"

RPM_NAME = "etcd-for-k8s1.22-3.5.0-1.9.aarch64.rpm"
RPM_HASH = "042bce208fcf4b332d7a2876a03b3ed30f7899c064959587bf332698b085358650e623b4b668fd6b9d771a3e7e4519120fdbed7e5200d855a68477c8c4986c48"

RPROVIDES:${PN} += "etcd-for-k8s etcd-for-k8s1.22 etcd-for-k8s1.22(aarch-64)"
RDEPENDS:${PN} += "/bin/bash libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm

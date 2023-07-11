SUMMARY = "Etcd and etcdtl for k8s image"
DESCRIPTION = "etcd is a distributed, consistent key-value store for shared configuration and \
service discovery. This package contains different versions of etcd and \
etcdctl for the kubernetes container image."
LICENSE = "Apache-2.0"

PV = "3.5.6"

RPM_NAME = "etcd-for-k8s1.25-3.5.6-1.4.aarch64.rpm"
RPM_HASH = "17f8432f1006843bf56ad402c4448f7a7e1d6bbb058eab009d0af8c573032e78d4d801d08a2bd14f6a9d6f4035e35c3edf1882421a092a635237e231cfae5c38"

RPROVIDES:${PN} += "etcd-for-k8s \
etcd-for-k8s1.25"

RDEPENDS:${PN} += "/usr/bin/bash \
libc.so.6"

inherit rpm

SUMMARY = "Etcd and etcdtl for k8s image"
DESCRIPTION = "etcd is a distributed, consistent key-value store for shared configuration and \
service discovery. This package contains different versions of etcd and \
etcdctl for the kubernetes container image."
LICENSE = "Apache-2.0"

PV = "3.5.6"

RPM_NAME = "etcd-for-k8s1.26-3.5.6-1.4.aarch64.rpm"
RPM_HASH = "c37f30a4fca6efdd634167ebe77dbfda36564844dbf6b072b4d24bc31b892581d0073f624fc948dc181377fcb45541c2e81f3584a5fecd1aaf8a4ab7b1d984e1"

RPROVIDES:${PN} += "etcd-for-k8s \
etcd-for-k8s1.26"

RDEPENDS:${PN} += "/usr/bin/bash \
libc.so.6"

inherit rpm

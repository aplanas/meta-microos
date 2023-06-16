SUMMARY = "Etcd and etcdtl for k8s image"
DESCRIPTION = "etcd is a distributed, consistent key-value store for shared configuration and \
service discovery. This package contains different versions of etcd and \
etcdctl for the kubernetes container image."
LICENSE = "Apache-2.0"

PV = "3.5.7"

RPM_NAME = "etcd-for-k8s1.27-3.5.7-1.1.aarch64.rpm"
RPM_HASH = "3dda23a3615ad90401d8c9436ac6c5be11ec9367cddd9016f0e7777955e1fc82421eb3369b08f3e0e70440bba15a7257e6d42562b31ffd7ec6562b44ead30549"

RPROVIDES:${PN} += "etcd-for-k8s \
etcd-for-k8s1.27"

RDEPENDS:${PN} += "/usr/bin/bash \
libc.so.6"

inherit rpm

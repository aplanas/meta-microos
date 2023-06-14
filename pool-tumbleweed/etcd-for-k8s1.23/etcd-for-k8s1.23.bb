SUMMARY = "Etcd and etcdtl for k8s image"
DESCRIPTION = "etcd is a distributed, consistent key-value store for shared configuration and \
service discovery. This package contains different versions of etcd and \
etcdctl for the kubernetes container image."
LICENSE = "Apache-2.0"

PV = "3.5.6"

RPM_NAME = "etcd-for-k8s1.23-3.5.6-1.4.aarch64.rpm"
RPM_HASH = "74e7c97fa92c9543aabbf898d53cc02af9d132d166f099f8d6d91271a4e0ff94d540b243d2f7dc6be9657175bff96390baf24c253b0915f22f35250ef8b0e831"

RPROVIDES:${PN} += "etcd-for-k8s \
etcd-for-k8s1.23"

RDEPENDS:${PN} += "/bin/bash \
libc.so.6"

inherit rpm

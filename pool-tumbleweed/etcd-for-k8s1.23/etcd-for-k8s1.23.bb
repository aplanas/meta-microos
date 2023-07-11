SUMMARY = "Etcd and etcdtl for k8s image"
DESCRIPTION = "etcd is a distributed, consistent key-value store for shared configuration and \
service discovery. This package contains different versions of etcd and \
etcdctl for the kubernetes container image."
LICENSE = "Apache-2.0"

PV = "3.5.6"

RPM_NAME = "etcd-for-k8s1.23-3.5.6-1.5.aarch64.rpm"
RPM_HASH = "a706230e214a9becae2b06e63e7ff1b5865613f194ac51ff5e85af7c8b417a6e2c2892036cd3180966db75aa56b19b75b49cd667dbe9b6db737fe62f9e314f32"

RPROVIDES:${PN} += "etcd-for-k8s \
etcd-for-k8s1.23"

RDEPENDS:${PN} += "/usr/bin/bash \
libc.so.6"

inherit rpm

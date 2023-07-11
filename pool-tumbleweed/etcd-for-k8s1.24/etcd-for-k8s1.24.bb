SUMMARY = "Etcd and etcdtl for k8s image"
DESCRIPTION = "etcd is a distributed, consistent key-value store for shared configuration and \
service discovery. This package contains different versions of etcd and \
etcdctl for the kubernetes container image."
LICENSE = "Apache-2.0"

PV = "3.5.6"

RPM_NAME = "etcd-for-k8s1.24-3.5.6-1.5.aarch64.rpm"
RPM_HASH = "d28b0f1ead440352e4babb38927cf521c7974303868501682fd2342e232aa32451cc10078afb36675130054ae66cd8ba57ac1ca74dc1386a5172cd8f956b2c46"

RPROVIDES:${PN} += "etcd-for-k8s \
etcd-for-k8s1.24"

RDEPENDS:${PN} += "/usr/bin/bash \
libc.so.6"

inherit rpm

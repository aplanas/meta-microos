SUMMARY = "Etcd and etcdtl for k8s image"
DESCRIPTION = "etcd is a distributed, consistent key-value store for shared configuration and \
service discovery. This package contains different versions of etcd and \
etcdctl for the kubernetes container image."
LICENSE = "Apache-2.0"

PV = "3.5.6"

RPM_NAME = "etcd-for-k8s1.25-3.5.6-1.3.aarch64.rpm"
RPM_HASH = "0d137818d8caead05254bf21270343133712c882dfde277b085f7b20248af4b0f55e56b85fb9e6f3cb8cc063a744875b762881a045f2d45e4ce042054050d77a"

RPROVIDES:${PN} += "etcd-for-k8s etcd-for-k8s1.25 etcd-for-k8s1.25(aarch-64)"
RDEPENDS:${PN} += "/bin/bash libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm

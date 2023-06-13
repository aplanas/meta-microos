SUMMARY = "A simple command line client for etcd"
DESCRIPTION = "A command line client for etcd. It can be used in scripts or for administrators \
to explore an etcd cluster."
LICENSE = "Apache-2.0"

PV = "3.5.9"

RPM_NAME = "etcdctl-3.5.9-1.1.aarch64.rpm"
RPM_HASH = "a7c05641c61fc59b8fbaec6aa37f97bcfc79da87b460df1342ea1522e3d28e1556371da8ebe7c54b917c6e97bf2cfa3de4702a448802bf674c24ddf238a33e65"

RPROVIDES:${PN} += "etcdctl \
etcdctl(aarch-64)"

RDEPENDS:${PN} += ""

inherit rpm

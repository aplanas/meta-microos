SUMMARY = "Container Network Interface - networking for Linux containers"
DESCRIPTION = "The CNI (Container Network Interface) project consists of a \
specification and libraries for writing plugins to configure \
network interfaces in Linux containers, along with a number of \
supported plugins. CNI concerns itself only with network \
connectivity of containers and removing allocated resources when \
the container is deleted. Because of this focus, CNI has a wide \
range of support and the specification is simple to implement."
LICENSE = "Apache-2.0"

PV = "1.1.2"

RPM_NAME = "cni-1.1.2-2.5.aarch64.rpm"
RPM_HASH = "8444d9a468c57a8f918c621bcc5cf4c4d02d53036e812daca096797d014765bb5b5fbd6b37a2a49be40f27f5ab1d800743d1719b0ca6394e340179cd28109189"

RPROVIDES:${PN} += "cni \
config-cni"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
fillup \
libc.so.6 \
systemd"

inherit rpm

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

RPM_NAME = "cni-1.1.2-2.4.aarch64.rpm"
RPM_HASH = "9c24c348fcb517bb7d01c4bf7592ffbb2700bd738fdbe5ba4db4c8d3e063f065a326fe4f7fcd86a531a9055c0487b4c06d8fcf3391bdb32d9fd9c854d42138d5"

RPROVIDES:${PN} += "cni \
cni(aarch-64) \
config(cni)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/mkdir \
/usr/bin/touch \
fillup \
libc.so.6(GLIBC_2.34)(64bit) \
systemd"

inherit rpm

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

RPM_NAME = "cni-1.1.2-2.3.aarch64.rpm"
RPM_HASH = "a88a59b57e4258baeed537427dc08220a9b0faeb634f75b6293cda53d69650681304ed066a0b789f6ab8c3ec76792b17c15e081a39a88565a0ca482b4212ec6e"

RPROVIDES:${PN} += "cni cni(aarch-64) config(cni)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/mkdir /usr/bin/touch fillup libc.so.6(GLIBC_2.34)(64bit) systemd"

inherit rpm

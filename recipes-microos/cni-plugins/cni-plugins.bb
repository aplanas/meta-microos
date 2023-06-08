SUMMARY = "Container Network Interface plugins"
DESCRIPTION = "The CNI (Container Network Interface) project consists of a \
specification and libraries for writing plugins to configure \
network interfaces in Linux containers, along with a number of \
supported plugins. CNI concerns itself only with network \
connectivity of containers and removing allocated resources when \
the container is deleted. Because of this focus, CNI has a wide \
range of support and the specification is simple to implement. \
 \
These are the additional CNI network plugins provided by \
the containernetworking team."
LICENSE = "Apache-2.0"

PV = "1.1.1"

RPM_NAME = "cni-plugins-1.1.1-2.3.aarch64.rpm"
RPM_HASH = "597d7da9da98af4d503048d8fb1e79d60b8e9950d01265be27122b306ccea46393aa1762a111b9b3e05e52d60e51ba6d0ef86f42e7ef361fb447c657ddea6608"

RPROVIDES:${PN} += "cni-plugins cni-plugins(aarch-64)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/mkdir /usr/bin/touch cni fillup libc.so.6(GLIBC_2.34)(64bit) systemd"

inherit rpm

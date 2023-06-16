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

RPM_NAME = "cni-plugins-1.1.1-2.4.aarch64.rpm"
RPM_HASH = "719b134e3ab080d74f74d89cc8b604372d7202693522fa0ccea59d46a023634737df9e64d4d290de94a88826529c38582bb99d50e4adc38fd8fbd86b96fe8a54"

RPROVIDES:${PN} += "cni-plugins"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
cni \
fillup \
libc.so.6 \
systemd"

inherit rpm

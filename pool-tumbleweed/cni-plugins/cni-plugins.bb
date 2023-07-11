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

RPM_NAME = "cni-plugins-1.1.1-2.5.aarch64.rpm"
RPM_HASH = "75396775ed12336c9836bf5cb29479c704b89a707a28137af353bb21f72b31965e91cf72af71630c242009cbfa9a17163363af327487e47fa19d055eb48f5ebb"

RPROVIDES:${PN} += "cni-plugins"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
cni \
fillup \
libc.so.6 \
systemd"

inherit rpm

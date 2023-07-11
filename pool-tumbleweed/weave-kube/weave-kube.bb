SUMMARY = "Pod Network Add-On"
DESCRIPTION = "Weave Net creates a virtual network that connects containers across multiple \
hosts and enables their automatic discovery. With Weave Net, portable \
microservices-based applications consisting of multiple containers can run \
anywhere: on one host, multiple hosts or even across cloud providers and data \
centers. Applications use the network just as if the containers were all plugged \
into the same network switch, without having to configure port mappings, \
ambassadors or links. \
 \
This package contains the files to be included into the weave-kube container image"
LICENSE = "Apache-2.0"

PV = "2.8.1"

RPM_NAME = "weave-kube-2.8.1-3.9.aarch64.rpm"
RPM_HASH = "de181773fecf5ad8155e4146a96cada710bf6b758f2a06deb59a863e8769fdffc59a011a455e66e551bf817170ad977b0abf990695225584a06dd139ea5bad8a"

RPROVIDES:${PN} += "weave-kube"

RDEPENDS:${PN} += "/usr/bin/sh \
/usr/sbin/modprobe \
bind-utils \
ca-certificates-mozilla \
conntrack-tools \
curl \
iproute2 \
ipset \
iptables \
libc.so.6 \
libpcap.so.1"

inherit rpm

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

RPM_NAME = "weave-kube-2.8.1-3.8.aarch64.rpm"
RPM_HASH = "370b18b4b5625f6092dc404619d89a3ab6fa2f29db13ffe463bd51f405dce9741b11e840a5ebc0fb2a2eb083e9ff1fbf72b6eff14c4168526bae28fe5465d26e"

RPROVIDES:${PN} += "weave-kube"

RDEPENDS:${PN} += "/bin/sh \
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

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

RPM_NAME = "weave-npc-2.8.1-3.9.aarch64.rpm"
RPM_HASH = "7747737851aef1e60efc245accae42f9a8604d9379a7201671a0e03eb38f07743e186fffad4e541587d5419e9e113b9d3cf859f9b4dd09dc24703a76b878ecf7"

RPROVIDES:${PN} += "config-weave-npc \
weave-npc"

RDEPENDS:${PN} += "ipset \
iptables \
ulogd \
ulogd-pcap"

inherit rpm

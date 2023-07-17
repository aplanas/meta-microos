SUMMARY = "Container network stack"
DESCRIPTION = "Netavark is a rust based network stack for containers. It is being \
designed to work with Podman but is also applicable for other OCI \
container management applications. \
Netavark is a tool for configuring networking for Linux containers. \
Its features include: \
* Configuration of container networks via JSON configuration file \
* Creation and management of required network interfaces, \
    including MACVLAN networks \
* All required firewall configuration to perform NAT and port \
    forwarding as required for containers \
* Support for iptables and firewalld at present, with support \
    for nftables planned in a future release \
* Support for rootless containers \
* Support for IPv4 and IPv6 \
* Support for container DNS resolution via aardvark-dns."
LICENSE = "Apache-2.0"

PV = "1.7.0"

RPM_NAME = "netavark-1.7.0-2.1.aarch64.rpm"
RPM_HASH = "9d5306d3c13d4e352e222849f5b6eff1697656468067805a6e6798f5efa072a72dfd4c327bf07938bba0de2ebd47526142068126cbc10f998f3baa5434dafd9e"

RPROVIDES:${PN} += "netavark"

RDEPENDS:${PN} += "/usr/bin/sh \
aardvark-dns \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm

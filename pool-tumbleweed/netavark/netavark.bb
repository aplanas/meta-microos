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

RPM_NAME = "netavark-1.7.0-1.1.aarch64.rpm"
RPM_HASH = "287e48dc8bf0f2c6db2fe124c9b9c4fadd5220c9325ace907088f3279c05547feb2970db3c2ed2441a218c561ba167474f8515207e65daea5c9ea6590b50378d"

RPROVIDES:${PN} += "netavark"

RDEPENDS:${PN} += "/usr/bin/sh \
aardvark-dns \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm

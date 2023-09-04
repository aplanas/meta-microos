SUMMARY = "Network driver plugin for the libvirtd daemon"
DESCRIPTION = "The network driver plugin for the libvirtd daemon, providing \
an implementation of the virtual network APIs using the Linux \
bridge capabilities."
LICENSE = "LGPL-2.1-or-later"

PV = "9.6.0"

RPM_NAME = "libvirt-daemon-driver-network-9.6.0-2.1.aarch64.rpm"
RPM_HASH = "96b3909db69a5de1cda18991972b25b8a11c775337bd87f951814fc51366462ef77a903832202121685aef8f233752baeb9a652922f5a996d076af7ebb59a03b"

RPROVIDES:${PN} += "config-libvirt-daemon-driver-network \
libvirt-daemon-driver-network \
libvirt-driver-network.so"

RDEPENDS:${PN} += "/usr/bin/sh \
dnsmasq \
iptables \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libtirpc.so.3 \
libvirt-daemon-common \
libvirt-libs \
libvirt-lxc.so.0 \
libvirt-qemu.so.0 \
libvirt.so.0"

inherit rpm

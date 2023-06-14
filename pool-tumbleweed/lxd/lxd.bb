SUMMARY = "Container hypervisor based on LXC"
DESCRIPTION = "LXD is a system container manager. It offers a user experience \
similar to virtual machines but uses Linux containers (LXC) instead."
LICENSE = "Apache-2.0"

PV = "5.13"

RPM_NAME = "lxd-5.13-1.1.aarch64.rpm"
RPM_HASH = "070d95d17ecafb059b5db30a0634576edcf767cef2d3734d2e1df784f2b263f64a36eec319f00e6d32e1d095a5821b17e39537e724fe50fdd4f4625aa93e5fda"

RPROVIDES:${PN} += "config-lxd \
group-lxd \
lxd"

RDEPENDS:${PN} += "/bin/sh \
acl \
dnsmasq \
ebtables \
kernel-base \
ld-linux-aarch64.so.1 \
libacl.so.1 \
libc.so.6 \
libcap.so.2 \
libgcc-s.so.1 \
liblxc.so.1 \
liblz4.so.1 \
libsqlite3.so.0 \
libudev.so.1 \
libuv.so.1 \
lxcfs \
lxcfs-hooks-lxc \
rsync \
squashfs \
sysuser-shadow \
tar \
xz"

inherit rpm

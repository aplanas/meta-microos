SUMMARY = "Container hypervisor based on LXC"
DESCRIPTION = "LXD is a system container manager. It offers a user experience \
similar to virtual machines but uses Linux containers (LXC) instead."
LICENSE = "Apache-2.0"

PV = "5.16"

RPM_NAME = "lxd-5.16-1.1.aarch64.rpm"
RPM_HASH = "b3cfd5918513823e775382d4f58a5a16b820089c0d650c56a0fe1c0bb006a403a5cf20254fef38221fc0e76d7a56a2a8ae272b572f9cdec8a77c923760494f3a"

RPROVIDES:${PN} += "config-lxd \
group-lxd \
lxd"

RDEPENDS:${PN} += "/usr/bin/sh \
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

SUMMARY = "Container hypervisor based on LXC"
DESCRIPTION = "LXD is a system container manager. It offers a user experience \
similar to virtual machines but uses Linux containers (LXC) instead."
LICENSE = "Apache-2.0"

PV = "5.13"

RPM_NAME = "lxd-5.13-2.1.aarch64.rpm"
RPM_HASH = "6bdcef13f93e63a0f38b728539708f5f882f15a606325451b5ee9c51835b9f06bb32c920d0fd4835e3d7d55637d925a85a3a0de5fa76594e442301987ab6b7de"

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

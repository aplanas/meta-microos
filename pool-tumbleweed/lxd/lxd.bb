SUMMARY = "Container hypervisor based on LXC"
DESCRIPTION = "LXD is a system container manager. It offers a user experience \
similar to virtual machines but uses Linux containers (LXC) instead."
LICENSE = "Apache-2.0"

PV = "5.16"

RPM_NAME = "lxd-5.16-2.1.aarch64.rpm"
RPM_HASH = "ad3dfd689b879a1b4b0b304fc99ff00e42533ddf9ca9a2cf9ca7095d2e2906d6daa02e13ac6b04c84caf14a8371e529cd617da2acb0ea9602a691675715d0977"

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

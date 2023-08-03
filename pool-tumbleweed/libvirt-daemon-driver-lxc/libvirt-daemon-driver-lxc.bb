SUMMARY = "LXC driver plugin for the libvirtd daemon"
DESCRIPTION = "The LXC driver plugin for the libvirtd daemon, providing \
an implementation of the hypervisor driver APIs using \
the Linux kernel"
LICENSE = "LGPL-2.1-or-later"

PV = "9.5.0"

RPM_NAME = "libvirt-daemon-driver-lxc-9.5.0-2.1.aarch64.rpm"
RPM_HASH = "770b826a30557b911eba50c6a99632addc8605c9c44852248291488dbf0cf968da8be5baf5a1de4f3d84bce308df70e62ff4ddfc5adb944ae551622013ce079c"

RPROVIDES:${PN} += "config-libvirt-daemon-driver-lxc \
libvirt-daemon-driver-lxc \
libvirt-driver-lxc.so"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libblkid.so.1 \
libc.so.6 \
libcap-ng.so.0 \
libfuse.so.2 \
libgcc-s.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libtirpc.so.3 \
libvirt-daemon-common \
libvirt-daemon-driver-network \
libvirt-libs \
libvirt-lxc.so.0 \
libvirt-qemu.so.0 \
libvirt.so.0 \
modutils \
systemd-container"

inherit rpm

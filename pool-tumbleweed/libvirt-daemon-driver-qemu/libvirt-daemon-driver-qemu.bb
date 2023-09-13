SUMMARY = "Qemu driver plugin for the libvirtd daemon"
DESCRIPTION = "The qemu driver plugin for the libvirtd daemon, providing \
an implementation of the hypervisor driver APIs using QEMU."
LICENSE = "LGPL-2.1-or-later"

PV = "9.7.0"

RPM_NAME = "libvirt-daemon-driver-qemu-9.7.0-1.1.aarch64.rpm"
RPM_HASH = "07ec5f3836e64112e9c12b73dbc3617b1126f0eb4dd3ed698f21b6f5f6241d30858912d79bef1b665d48d00d728e44bf25fa5222e014b6e324a01ac0ec4c3146"

RPROVIDES:${PN} += "config-libvirt-daemon-driver-qemu \
libvirt-daemon-driver-qemu \
libvirt-driver-qemu.so"

RDEPENDS:${PN} += "/usr/bin/bzip2 \
/usr/bin/gzip \
/usr/bin/lzop \
/usr/bin/qemu-img \
/usr/bin/sh \
/usr/bin/xz \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgnutls.so.30 \
libgobject-2.0.so.0 \
libselinux.so.1 \
libtirpc.so.3 \
libvirt-daemon-common \
libvirt-daemon-log \
libvirt-libs \
libvirt-lxc.so.0 \
libvirt-qemu.so.0 \
libvirt.so.0 \
libxml2.so.2 \
qemu \
qemu-uefi-aarch64 \
swtpm \
systemd-container"

inherit rpm

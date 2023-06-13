SUMMARY = "Qemu driver plugin for the libvirtd daemon"
DESCRIPTION = "The qemu driver plugin for the libvirtd daemon, providing \
an implementation of the hypervisor driver APIs using QEMU."
LICENSE = "LGPL-2.1-or-later"

PV = "9.4.0"

RPM_NAME = "libvirt-daemon-driver-qemu-9.4.0-1.1.aarch64.rpm"
RPM_HASH = "2574fbbb41483c2f46b234a367840fb2854c7d234c383b9da6d4d298a4da1c237e63c7ab2be453ad5bc58aa6447b8b3f55a89e9f3472070b72c248859b05325e"

RPROVIDES:${PN} += "config(libvirt-daemon-driver-qemu) \
libvirt-daemon-driver-qemu \
libvirt-daemon-driver-qemu(aarch-64) \
libvirt_driver_qemu.so()(64bit)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/bzip2 \
/usr/bin/gzip \
/usr/bin/lzop \
/usr/bin/qemu-img \
/usr/bin/xz \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgnutls.so.30()(64bit) \
libgnutls.so.30(GNUTLS_3_4)(64bit) \
libgobject-2.0.so.0()(64bit) \
libselinux.so.1()(64bit) \
libtirpc.so.3()(64bit) \
libvirt-daemon-common \
libvirt-daemon-log \
libvirt-libs \
libvirt-lxc.so.0()(64bit) \
libvirt-qemu.so.0()(64bit) \
libvirt.so.0()(64bit) \
libxml2.so.2()(64bit) \
qemu \
qemu-uefi-aarch64 \
swtpm \
systemd-container"

inherit rpm

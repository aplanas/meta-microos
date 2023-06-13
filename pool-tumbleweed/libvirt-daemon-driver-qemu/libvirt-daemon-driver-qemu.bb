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
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgnutls.so.30()(64bit) \
libgnutls.so.30(GNUTLS_3_4)(64bit) \
libgobject-2.0.so.0()(64bit) \
libselinux.so.1()(64bit) \
libselinux.so.1(LIBSELINUX_1.0)(64bit) \
libtirpc.so.3()(64bit) \
libtirpc.so.3(TIRPC_0.3.0)(64bit) \
libvirt-daemon-common \
libvirt-daemon-log \
libvirt-libs \
libvirt-lxc.so.0()(64bit) \
libvirt-lxc.so.0(LIBVIRT_LXC_1.0.2)(64bit) \
libvirt-qemu.so.0()(64bit) \
libvirt-qemu.so.0(LIBVIRT_QEMU_0.10.0)(64bit) \
libvirt-qemu.so.0(LIBVIRT_QEMU_0.8.3)(64bit) \
libvirt-qemu.so.0(LIBVIRT_QEMU_0.9.4)(64bit) \
libvirt-qemu.so.0(LIBVIRT_QEMU_1.2.3)(64bit) \
libvirt-qemu.so.0(LIBVIRT_QEMU_8.2.0)(64bit) \
libvirt.so.0()(64bit) \
libvirt.so.0(LIBVIRT_0.0.3)(64bit) \
libvirt.so.0(LIBVIRT_0.0.5)(64bit) \
libvirt.so.0(LIBVIRT_0.1.0)(64bit) \
libvirt.so.0(LIBVIRT_0.1.1)(64bit) \
libvirt.so.0(LIBVIRT_0.1.4)(64bit) \
libvirt.so.0(LIBVIRT_0.1.5)(64bit) \
libvirt.so.0(LIBVIRT_0.1.9)(64bit) \
libvirt.so.0(LIBVIRT_0.10.0)(64bit) \
libvirt.so.0(LIBVIRT_0.10.2)(64bit) \
libvirt.so.0(LIBVIRT_0.2.0)(64bit) \
libvirt.so.0(LIBVIRT_0.2.1)(64bit) \
libvirt.so.0(LIBVIRT_0.2.3)(64bit) \
libvirt.so.0(LIBVIRT_0.3.0)(64bit) \
libvirt.so.0(LIBVIRT_0.3.2)(64bit) \
libvirt.so.0(LIBVIRT_0.3.3)(64bit) \
libvirt.so.0(LIBVIRT_0.4.0)(64bit) \
libvirt.so.0(LIBVIRT_0.4.1)(64bit) \
libvirt.so.0(LIBVIRT_0.4.2)(64bit) \
libvirt.so.0(LIBVIRT_0.4.5)(64bit) \
libvirt.so.0(LIBVIRT_0.5.0)(64bit) \
libvirt.so.0(LIBVIRT_0.6.1)(64bit) \
libvirt.so.0(LIBVIRT_0.6.3)(64bit) \
libvirt.so.0(LIBVIRT_0.6.4)(64bit) \
libvirt.so.0(LIBVIRT_0.7.0)(64bit) \
libvirt.so.0(LIBVIRT_0.7.1)(64bit) \
libvirt.so.0(LIBVIRT_0.7.2)(64bit) \
libvirt.so.0(LIBVIRT_0.7.3)(64bit) \
libvirt.so.0(LIBVIRT_0.7.5)(64bit) \
libvirt.so.0(LIBVIRT_0.7.7)(64bit) \
libvirt.so.0(LIBVIRT_0.8.0)(64bit) \
libvirt.so.0(LIBVIRT_0.8.1)(64bit) \
libvirt.so.0(LIBVIRT_0.8.2)(64bit) \
libvirt.so.0(LIBVIRT_0.8.5)(64bit) \
libvirt.so.0(LIBVIRT_0.8.6)(64bit) \
libvirt.so.0(LIBVIRT_0.8.8)(64bit) \
libvirt.so.0(LIBVIRT_0.9.0)(64bit) \
libvirt.so.0(LIBVIRT_0.9.10)(64bit) \
libvirt.so.0(LIBVIRT_0.9.11)(64bit) \
libvirt.so.0(LIBVIRT_0.9.13)(64bit) \
libvirt.so.0(LIBVIRT_0.9.2)(64bit) \
libvirt.so.0(LIBVIRT_0.9.3)(64bit) \
libvirt.so.0(LIBVIRT_0.9.4)(64bit) \
libvirt.so.0(LIBVIRT_0.9.5)(64bit) \
libvirt.so.0(LIBVIRT_0.9.7)(64bit) \
libvirt.so.0(LIBVIRT_0.9.8)(64bit) \
libvirt.so.0(LIBVIRT_0.9.9)(64bit) \
libvirt.so.0(LIBVIRT_1.0.0)(64bit) \
libvirt.so.0(LIBVIRT_1.0.1)(64bit) \
libvirt.so.0(LIBVIRT_1.0.2)(64bit) \
libvirt.so.0(LIBVIRT_1.0.3)(64bit) \
libvirt.so.0(LIBVIRT_1.0.5)(64bit) \
libvirt.so.0(LIBVIRT_1.0.6)(64bit) \
libvirt.so.0(LIBVIRT_1.1.1)(64bit) \
libvirt.so.0(LIBVIRT_1.1.3)(64bit) \
libvirt.so.0(LIBVIRT_1.2.1)(64bit) \
libvirt.so.0(LIBVIRT_1.2.11)(64bit) \
libvirt.so.0(LIBVIRT_1.2.12)(64bit) \
libvirt.so.0(LIBVIRT_1.2.14)(64bit) \
libvirt.so.0(LIBVIRT_1.2.15)(64bit) \
libvirt.so.0(LIBVIRT_1.2.16)(64bit) \
libvirt.so.0(LIBVIRT_1.2.19)(64bit) \
libvirt.so.0(LIBVIRT_1.2.3)(64bit) \
libvirt.so.0(LIBVIRT_1.2.5)(64bit) \
libvirt.so.0(LIBVIRT_1.2.6)(64bit) \
libvirt.so.0(LIBVIRT_1.2.7)(64bit) \
libvirt.so.0(LIBVIRT_1.2.8)(64bit) \
libvirt.so.0(LIBVIRT_1.2.9)(64bit) \
libvirt.so.0(LIBVIRT_1.3.3)(64bit) \
libvirt.so.0(LIBVIRT_2.0.0)(64bit) \
libvirt.so.0(LIBVIRT_2.2.0)(64bit) \
libvirt.so.0(LIBVIRT_3.0.0)(64bit) \
libvirt.so.0(LIBVIRT_3.1.0)(64bit) \
libvirt.so.0(LIBVIRT_3.4.0)(64bit) \
libvirt.so.0(LIBVIRT_3.7.0)(64bit) \
libvirt.so.0(LIBVIRT_3.9.0)(64bit) \
libvirt.so.0(LIBVIRT_4.1.0)(64bit) \
libvirt.so.0(LIBVIRT_4.10.0)(64bit) \
libvirt.so.0(LIBVIRT_4.4.0)(64bit) \
libvirt.so.0(LIBVIRT_4.5.0)(64bit) \
libvirt.so.0(LIBVIRT_5.10.0)(64bit) \
libvirt.so.0(LIBVIRT_5.2.0)(64bit) \
libvirt.so.0(LIBVIRT_5.5.0)(64bit) \
libvirt.so.0(LIBVIRT_5.6.0)(64bit) \
libvirt.so.0(LIBVIRT_5.7.0)(64bit) \
libvirt.so.0(LIBVIRT_5.8.0)(64bit) \
libvirt.so.0(LIBVIRT_6.0.0)(64bit) \
libvirt.so.0(LIBVIRT_6.10.0)(64bit) \
libvirt.so.0(LIBVIRT_7.1.0)(64bit) \
libvirt.so.0(LIBVIRT_7.2.0)(64bit) \
libvirt.so.0(LIBVIRT_7.3.0)(64bit) \
libvirt.so.0(LIBVIRT_7.7.0)(64bit) \
libvirt.so.0(LIBVIRT_7.8.0)(64bit) \
libvirt.so.0(LIBVIRT_8.0.0)(64bit) \
libvirt.so.0(LIBVIRT_8.4.0)(64bit) \
libvirt.so.0(LIBVIRT_8.5.0)(64bit) \
libvirt.so.0(LIBVIRT_9.0.0)(64bit) \
libvirt.so.0(LIBVIRT_PRIVATE_9.4.0)(64bit) \
libxml2.so.2()(64bit) \
libxml2.so.2(LIBXML2_2.4.30)(64bit) \
qemu \
qemu-uefi-aarch64 \
swtpm \
systemd-container"

inherit rpm

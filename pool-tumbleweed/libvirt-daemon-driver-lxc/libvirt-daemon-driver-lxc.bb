SUMMARY = "LXC driver plugin for the libvirtd daemon"
DESCRIPTION = "The LXC driver plugin for the libvirtd daemon, providing \
an implementation of the hypervisor driver APIs using \
the Linux kernel"
LICENSE = "LGPL-2.1-or-later"

PV = "9.5.0"

RPM_NAME = "libvirt-daemon-driver-lxc-9.5.0-1.1.aarch64.rpm"
RPM_HASH = "0edee4327ebb9a9585c61d6c984cfc5bc2d41788a255599586651fed5f03efc5b455d1f0b966a54c6cfab2e181cb373e9d5d207dc89335f362546c6a57f2948c"

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

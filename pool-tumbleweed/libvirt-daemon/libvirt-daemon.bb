SUMMARY = "Server side daemon and supporting files for libvirt"
DESCRIPTION = "Server side daemon required to manage the virtualization capabilities \
of recent versions of Linux. Requires a hypervisor specific sub-RPM \
for specific drivers."
LICENSE = "LGPL-2.1-or-later"

PV = "9.6.0"

RPM_NAME = "libvirt-daemon-9.6.0-2.1.aarch64.rpm"
RPM_HASH = "e9c2323036922136e58b8ff71416bdeed5106deeebe9248a83c9f1c100319004fafd497cededd2994cd10622b8c08b8bc2edf9fbf00a2b7c662aa86a106d2985"

RPROVIDES:${PN} += "config-libvirt-daemon \
libvirt-daemon"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libtirpc.so.3 \
libvirt-daemon-common \
libvirt-daemon-lock \
libvirt-daemon-log \
libvirt-daemon-plugin-lockd \
libvirt-daemon-proxy \
libvirt-libs \
libvirt-lxc.so.0 \
libvirt-qemu.so.0 \
libvirt.so.0"

inherit rpm

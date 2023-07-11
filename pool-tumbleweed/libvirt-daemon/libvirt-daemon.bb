SUMMARY = "Server side daemon and supporting files for libvirt"
DESCRIPTION = "Server side daemon required to manage the virtualization capabilities \
of recent versions of Linux. Requires a hypervisor specific sub-RPM \
for specific drivers."
LICENSE = "LGPL-2.1-or-later"

PV = "9.4.0"

RPM_NAME = "libvirt-daemon-9.4.0-3.1.aarch64.rpm"
RPM_HASH = "d64acedce240d30f09e2dab494b6c8dcb5b1bb44a6aa88a5c51ce8056027591dc6394374d8f851d2fd49dd8b97bc42e135453f515d606aa054a3c085e02c413d"

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

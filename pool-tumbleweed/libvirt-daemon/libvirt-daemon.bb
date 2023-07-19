SUMMARY = "Server side daemon and supporting files for libvirt"
DESCRIPTION = "Server side daemon required to manage the virtualization capabilities \
of recent versions of Linux. Requires a hypervisor specific sub-RPM \
for specific drivers."
LICENSE = "LGPL-2.1-or-later"

PV = "9.5.0"

RPM_NAME = "libvirt-daemon-9.5.0-1.1.aarch64.rpm"
RPM_HASH = "d060a25db502a9fd6c9f714f4a826a7c26017b823fb5ef481f41bde15fb934df626a922d3713b7c7a10e08a722113537a7eaad201c4ef4b3c3c635695264c46d"

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

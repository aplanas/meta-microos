SUMMARY = "Server side daemon and supporting files for libvirt"
DESCRIPTION = "Server side daemon required to manage the virtualization capabilities \
of recent versions of Linux. Requires a hypervisor specific sub-RPM \
for specific drivers."
LICENSE = "LGPL-2.1-or-later"

PV = "9.4.0"

RPM_NAME = "libvirt-daemon-9.4.0-1.1.aarch64.rpm"
RPM_HASH = "f5020931cfb4189a09d14ca6f6132ce3b2c0655b8ac4d4400f908efeaf8b63a0de9e3ca528c7651ad90f878e9639b381c8d05efb27527ad307c75bde2f0b8180"

RPROVIDES:${PN} += "config(libvirt-daemon) \
libvirt-daemon \
libvirt-daemon(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libtirpc.so.3()(64bit) \
libvirt-daemon-common \
libvirt-daemon-lock \
libvirt-daemon-log \
libvirt-daemon-plugin-lockd \
libvirt-daemon-proxy \
libvirt-libs \
libvirt-lxc.so.0()(64bit) \
libvirt-qemu.so.0()(64bit) \
libvirt.so.0()(64bit)"

inherit rpm

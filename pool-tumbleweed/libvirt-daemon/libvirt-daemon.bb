SUMMARY = "Server side daemon and supporting files for libvirt"
DESCRIPTION = "Server side daemon required to manage the virtualization capabilities \
of recent versions of Linux. Requires a hypervisor specific sub-RPM \
for specific drivers."
LICENSE = "LGPL-2.1-or-later"

PV = "9.6.0"

RPM_NAME = "libvirt-daemon-9.6.0-3.1.aarch64.rpm"
RPM_HASH = "393f40140899cd40640f74d6bc7f7e826d9b4e66210f139b1e39dd2974290da32c8a316d050cd1741ed6922272ebc2b53ca444fe8a9b7e85a1186413f27cdcae"

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

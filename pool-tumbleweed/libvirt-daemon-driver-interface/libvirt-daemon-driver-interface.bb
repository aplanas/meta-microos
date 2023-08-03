SUMMARY = "Interface driver plugin for the libvirtd daemon"
DESCRIPTION = "The interface driver plugin for the libvirtd daemon, providing \
an implementation of the network interface APIs using the \
netcontrol library"
LICENSE = "LGPL-2.1-or-later"

PV = "9.5.0"

RPM_NAME = "libvirt-daemon-driver-interface-9.5.0-2.1.aarch64.rpm"
RPM_HASH = "0355a1940fbb96fe3a881b8b7203cc2fbd7b302a23ed12d6532b8ab029431c8685b7fbb36368c0efe8c46953299b6fa86929af4086d4d36df2ea53c654b83aab"

RPROVIDES:${PN} += "config-libvirt-daemon-driver-interface \
libvirt-daemon-driver-interface \
libvirt-driver-interface.so"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libnetcontrol.so.0 \
libtirpc.so.3 \
libudev.so.1 \
libvirt-daemon-common \
libvirt-libs \
libvirt-lxc.so.0 \
libvirt-qemu.so.0 \
libvirt.so.0"

inherit rpm

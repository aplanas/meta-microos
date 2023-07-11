SUMMARY = "Interface driver plugin for the libvirtd daemon"
DESCRIPTION = "The interface driver plugin for the libvirtd daemon, providing \
an implementation of the network interface APIs using the \
netcontrol library"
LICENSE = "LGPL-2.1-or-later"

PV = "9.4.0"

RPM_NAME = "libvirt-daemon-driver-interface-9.4.0-3.1.aarch64.rpm"
RPM_HASH = "4518f305ed19acfa7c2019c93ab4e9bcab2bff4dcfbe59a7c7ea9eac72f0ec300dd3c6c78729d3e6975968d2761b6350fd7f203a2eadb70bac1fbe93cc143709"

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

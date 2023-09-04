SUMMARY = "Library providing a virtualization API"
DESCRIPTION = "Libvirt is a C toolkit to interact with the virtualization \
capabilities of Linux. Virtualization of the Linux Operating System means \
the ability to run multiple instances of Operating Systems concurrently \
on a single hardware system where the basic resources are driven by a \
Linux instance. The library aims to provide long term stable C API \
to interact with Linux virtualization technologies."
LICENSE = "LGPL-2.1-or-later"

PV = "9.6.0"

RPM_NAME = "libvirt-9.6.0-2.1.aarch64.rpm"
RPM_HASH = "9f7f371924b94fa679b6ed498baf713ddd6d12b401d95de11942d369936008c5d70e237127763c77294f8c5f82635f05ce3d8e386f2585cea70333de7487ffb1"

RPROVIDES:${PN} += "libvirt"

RDEPENDS:${PN} += "libvirt-client \
libvirt-daemon \
libvirt-daemon-config-network \
libvirt-daemon-config-nwfilter \
libvirt-daemon-driver-interface \
libvirt-daemon-driver-network \
libvirt-daemon-driver-nodedev \
libvirt-daemon-driver-nwfilter \
libvirt-daemon-driver-qemu \
libvirt-daemon-driver-secret \
libvirt-daemon-driver-storage \
libvirt-libs"

inherit rpm

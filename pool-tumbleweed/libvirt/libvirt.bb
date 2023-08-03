SUMMARY = "Library providing a virtualization API"
DESCRIPTION = "Libvirt is a C toolkit to interact with the virtualization \
capabilities of Linux. Virtualization of the Linux Operating System means \
the ability to run multiple instances of Operating Systems concurrently \
on a single hardware system where the basic resources are driven by a \
Linux instance. The library aims to provide long term stable C API \
to interact with Linux virtualization technologies."
LICENSE = "LGPL-2.1-or-later"

PV = "9.5.0"

RPM_NAME = "libvirt-9.5.0-2.1.aarch64.rpm"
RPM_HASH = "6ff68fa525d30f2d56e10decb51a5945613bb48e07056e3414dad46d18bbcb20ee4b566f73f50dc059af08a73265d63fd48428a1e2562a6c984e77ed87bed9ec"

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

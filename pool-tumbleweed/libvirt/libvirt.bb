SUMMARY = "Library providing a virtualization API"
DESCRIPTION = "Libvirt is a C toolkit to interact with the virtualization \
capabilities of Linux. Virtualization of the Linux Operating System means \
the ability to run multiple instances of Operating Systems concurrently \
on a single hardware system where the basic resources are driven by a \
Linux instance. The library aims to provide long term stable C API \
to interact with Linux virtualization technologies."
LICENSE = "LGPL-2.1-or-later"

PV = "9.4.0"

RPM_NAME = "libvirt-9.4.0-3.1.aarch64.rpm"
RPM_HASH = "1a537bb9bc01df252896059a4c473e4f4bc69a47750856e96040b9660ff8967d11982ceb3bf0d00c4a312fa61cbf62ce49d0d76748790d78f181f859255ffdd0"

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

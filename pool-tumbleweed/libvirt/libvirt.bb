SUMMARY = "Library providing a virtualization API"
DESCRIPTION = "Libvirt is a C toolkit to interact with the virtualization \
capabilities of Linux. Virtualization of the Linux Operating System means \
the ability to run multiple instances of Operating Systems concurrently \
on a single hardware system where the basic resources are driven by a \
Linux instance. The library aims to provide long term stable C API \
to interact with Linux virtualization technologies."
LICENSE = "LGPL-2.1-or-later"

PV = "9.5.0"

RPM_NAME = "libvirt-9.5.0-1.1.aarch64.rpm"
RPM_HASH = "0da1dedcde0f2b90eb45482939d841e9c63ba386a69c869bab7fcb18aa9e6dfff20c1a25a952fa776f5da0d4cfa671a20f5f80f37f3428bdfdfc0d1905a12c2d"

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

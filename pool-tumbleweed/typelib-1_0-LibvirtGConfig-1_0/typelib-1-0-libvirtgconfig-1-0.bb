SUMMARY = "GLib and GObject mapping of libvirt - gi-bindings"
DESCRIPTION = "libvirt is a C toolkit to interact with the virtualization capabilities \
of recent versions of Linux (and other OSes). It is free software \
available under the GNU Lesser General Public License. Virtualization on \
the Linux Operating System means the ability to run multiple instances of \
Operating Systems concurrently on a single hardware system where the basic \
resources are driven by a Linux instance. The library aim at providing \
long term stable C API initially for the Xen paravirtualization but \
should be able to integrate other virtualization mechanisms if needed"
LICENSE = "LGPL-2.1-or-later"

PV = "4.0.0"

RPM_NAME = "typelib-1_0-LibvirtGConfig-1_0-4.0.0-1.11.aarch64.rpm"
RPM_HASH = "0bf0bc37f4d0040045a523dc37e948af336316ea9d5746f7d298d6d1ca43a9891bd435dd3ea4a19def043cf850740d96154ea03ce7a725175b3db3810be42f16"

RPROVIDES:${PN} += "typelib-1-0-LibvirtGConfig-1-0 \
typelib-LibvirtGConfig"

RDEPENDS:${PN} += "libvirt-gconfig-1.0.so.0 \
typelib-GLib \
typelib-GObject \
typelib-libxml2"

inherit rpm

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

RPM_NAME = "typelib-1_0-LibvirtGLib-1_0-4.0.0-1.10.aarch64.rpm"
RPM_HASH = "730305504932f5a5525159f4a016d68a1b1698c8666016a152d902bd0e3d5234a21665f252818078fe53c57e964fef4041c7217bdb10e739ad5f6fb44ed162c2"

RPROVIDES:${PN} += "typelib(LibvirtGLib) \
typelib-1_0-LibvirtGLib-1_0 \
typelib-1_0-LibvirtGLib-1_0(aarch-64)"

RDEPENDS:${PN} += "libvirt-glib-1.0.so.0()(64bit) \
typelib(GLib)"

inherit rpm

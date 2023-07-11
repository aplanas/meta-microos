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

RPM_NAME = "typelib-1_0-LibvirtGLib-1_0-4.0.0-1.11.aarch64.rpm"
RPM_HASH = "05107c6961309b5f20c77603188f9447d006cf2a1c4eb3ef1b2dcefbb7c8e0e1a12fb3097a5ab8367929e09fe64ae0b91b5f396f43db06778b28c07217f831e7"

RPROVIDES:${PN} += "typelib-1-0-LibvirtGLib-1-0 \
typelib-LibvirtGLib"

RDEPENDS:${PN} += "libvirt-glib-1.0.so.0 \
typelib-GLib"

inherit rpm

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

RPM_NAME = "typelib-1_0-LibvirtGObject-1_0-4.0.0-1.11.aarch64.rpm"
RPM_HASH = "7536295c9e0b1f8341c3e61d68fd9ea57cdceb671b9d6765b58033ef96a86ebffa9afecaab7b57bb4d866260ee7fdc35a48e2513e0fd26f399399a8e4411234e"

RPROVIDES:${PN} += "typelib-1-0-LibvirtGObject-1-0 \
typelib-LibvirtGObject"

RDEPENDS:${PN} += "libvirt-gobject-1.0.so.0 \
typelib-GLib \
typelib-GObject \
typelib-Gio \
typelib-LibvirtGConfig \
typelib-LibvirtGLib \
typelib-libxml2"

inherit rpm

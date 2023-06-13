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

RPM_NAME = "typelib-1_0-LibvirtGObject-1_0-4.0.0-1.10.aarch64.rpm"
RPM_HASH = "928917ad1aadd08400baca125df8c47f3d1cdc253526d7506a3fa6a2e80acd3bc1db4ffa2640036b782fbf340be07b5612c90cc28f594e5ac1eb7be164debfeb"

RPROVIDES:${PN} += "typelib(LibvirtGObject) \
typelib-1_0-LibvirtGObject-1_0 \
typelib-1_0-LibvirtGObject-1_0(aarch-64)"

RDEPENDS:${PN} += "libvirt-gobject-1.0.so.0()(64bit) \
typelib(GLib) \
typelib(GObject) \
typelib(Gio) \
typelib(LibvirtGConfig) \
typelib(LibvirtGLib) \
typelib(libxml2)"

inherit rpm

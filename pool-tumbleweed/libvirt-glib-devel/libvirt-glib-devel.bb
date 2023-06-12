SUMMARY = "GLib and GObject mapping of libvirt - Development files"
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

RPM_NAME = "libvirt-glib-devel-4.0.0-1.10.aarch64.rpm"
RPM_HASH = "1d7c5c409f062f7e2397a7f38b2e51ad383533795335cd2f41de0ae47162f6f18f5aaa6a9ba7f414db2e447c96b03742b2e37fa4aabe01d66edffef40de586f3"

RPROVIDES:${PN} += "libvirt-glib-devel \
libvirt-glib-devel(aarch-64) \
pkgconfig(libvirt-gconfig-1.0) \
pkgconfig(libvirt-glib-1.0) \
pkgconfig(libvirt-gobject-1.0)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libvirt-glib-1_0-0 \
pkgconfig(gio-2.0) \
pkgconfig(glib-2.0) \
pkgconfig(gobject-2.0) \
pkgconfig(gthread-2.0) \
pkgconfig(libvirt) \
pkgconfig(libvirt-gconfig-1.0) \
pkgconfig(libxml-2.0) \
typelib-1_0-LibvirtGConfig-1_0 \
typelib-1_0-LibvirtGLib-1_0 \
typelib-1_0-LibvirtGObject-1_0"

inherit rpm

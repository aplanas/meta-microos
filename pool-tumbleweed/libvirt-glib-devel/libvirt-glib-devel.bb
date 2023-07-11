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

RPM_NAME = "libvirt-glib-devel-4.0.0-1.11.aarch64.rpm"
RPM_HASH = "2509af9972908e345b4124a9c6753c92147a1efd0ee66913febc66c7136893549b5494feda340a5d01ce8165d16b2995f2fd71ad1373d56d719171b68e8d2a52"

RPROVIDES:${PN} += "libvirt-glib-devel \
pkgconfig-libvirt-gconfig-1.0 \
pkgconfig-libvirt-glib-1.0 \
pkgconfig-libvirt-gobject-1.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libvirt-glib-1-0-0 \
pkgconfig-gio-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-gthread-2.0 \
pkgconfig-libvirt \
pkgconfig-libvirt-gconfig-1.0 \
pkgconfig-libxml-2.0 \
typelib-1-0-LibvirtGConfig-1-0 \
typelib-1-0-LibvirtGLib-1-0 \
typelib-1-0-LibvirtGObject-1-0"

inherit rpm

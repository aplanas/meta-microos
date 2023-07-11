SUMMARY = "GLib and GObject mapping of libvirt"
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

RPM_NAME = "libvirt-glib-1_0-0-4.0.0-1.11.aarch64.rpm"
RPM_HASH = "8c09a7d4a4a5798ddddadb968ea45197e51e51427de95d0bc291fb853368aa954d4faea316372f75a459a0ed101e66fae7384aba3eab6265a5fcbd96afac130c"

RPROVIDES:${PN} += "libvirt-gconfig-1.0.so.0 \
libvirt-glib-1-0-0 \
libvirt-glib-1.0.so.0 \
libvirt-gobject-1.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libvirt.so.0 \
libxml2.so.2"

inherit rpm

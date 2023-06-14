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

RPM_NAME = "libvirt-glib-1_0-0-4.0.0-1.10.aarch64.rpm"
RPM_HASH = "fce9d98a19875184ea9952fe96a4ad2c9c18d7533a9fbdcc0509a169d85c6720fe110c50ba8ba9a1bccafc75583ed9264b198f5290aa8126df979387310d033d"

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

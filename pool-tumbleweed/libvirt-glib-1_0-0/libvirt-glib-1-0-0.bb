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

RPROVIDES:${PN} += "libvirt-gconfig-1.0.so.0()(64bit) \
libvirt-gconfig-1.0.so.0(LIBVIRT_GCONFIG_0.0.8)(64bit) \
libvirt-gconfig-1.0.so.0(LIBVIRT_GCONFIG_0.0.9)(64bit) \
libvirt-gconfig-1.0.so.0(LIBVIRT_GCONFIG_0.1.0)(64bit) \
libvirt-gconfig-1.0.so.0(LIBVIRT_GCONFIG_0.1.3)(64bit) \
libvirt-gconfig-1.0.so.0(LIBVIRT_GCONFIG_0.1.4)(64bit) \
libvirt-gconfig-1.0.so.0(LIBVIRT_GCONFIG_0.1.5)(64bit) \
libvirt-gconfig-1.0.so.0(LIBVIRT_GCONFIG_0.1.6)(64bit) \
libvirt-gconfig-1.0.so.0(LIBVIRT_GCONFIG_0.1.7)(64bit) \
libvirt-gconfig-1.0.so.0(LIBVIRT_GCONFIG_0.1.8)(64bit) \
libvirt-gconfig-1.0.so.0(LIBVIRT_GCONFIG_0.1.9)(64bit) \
libvirt-gconfig-1.0.so.0(LIBVIRT_GCONFIG_0.2.0)(64bit) \
libvirt-gconfig-1.0.so.0(LIBVIRT_GCONFIG_0.2.1)(64bit) \
libvirt-gconfig-1.0.so.0(LIBVIRT_GCONFIG_0.2.2)(64bit) \
libvirt-gconfig-1.0.so.0(LIBVIRT_GCONFIG_0.2.4)(64bit) \
libvirt-gconfig-1.0.so.0(LIBVIRT_GCONFIG_2.0.0)(64bit) \
libvirt-gconfig-1.0.so.0(LIBVIRT_GCONFIG_3.0.0)(64bit) \
libvirt-gconfig-1.0.so.0(LIBVIRT_GCONFIG_3.1.0)(64bit) \
libvirt-glib-1.0.so.0()(64bit) \
libvirt-glib-1.0.so.0(LIBVIRT_GLIB_0.0.7)(64bit) \
libvirt-glib-1.0.so.0(LIBVIRT_GLIB_0.1.4)(64bit) \
libvirt-glib-1_0-0 \
libvirt-glib-1_0-0(aarch-64) \
libvirt-gobject-1.0.so.0()(64bit) \
libvirt-gobject-1.0.so.0(LIBVIRT_GOBJECT_0.0.8)(64bit) \
libvirt-gobject-1.0.so.0(LIBVIRT_GOBJECT_0.0.9)(64bit) \
libvirt-gobject-1.0.so.0(LIBVIRT_GOBJECT_0.1.1)(64bit) \
libvirt-gobject-1.0.so.0(LIBVIRT_GOBJECT_0.1.2)(64bit) \
libvirt-gobject-1.0.so.0(LIBVIRT_GOBJECT_0.1.3)(64bit) \
libvirt-gobject-1.0.so.0(LIBVIRT_GOBJECT_0.1.4)(64bit) \
libvirt-gobject-1.0.so.0(LIBVIRT_GOBJECT_0.1.5)(64bit) \
libvirt-gobject-1.0.so.0(LIBVIRT_GOBJECT_0.1.9)(64bit) \
libvirt-gobject-1.0.so.0(LIBVIRT_GOBJECT_0.2.0)(64bit) \
libvirt-gobject-1.0.so.0(LIBVIRT_GOBJECT_0.2.1)(64bit) \
libvirt-gobject-1.0.so.0(LIBVIRT_GOBJECT_0.2.2)(64bit) \
libvirt-gobject-1.0.so.0(LIBVIRT_GOBJECT_0.2.3)(64bit) \
libvirt-gobject-1.0.so.0(LIBVIRT_GOBJECT_3.0.0)(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libvirt.so.0()(64bit) \
libvirt.so.0(LIBVIRT_0.0.3)(64bit) \
libvirt.so.0(LIBVIRT_0.1.0)(64bit) \
libvirt.so.0(LIBVIRT_0.1.1)(64bit) \
libvirt.so.0(LIBVIRT_0.10.2)(64bit) \
libvirt.so.0(LIBVIRT_0.2.0)(64bit) \
libvirt.so.0(LIBVIRT_0.2.1)(64bit) \
libvirt.so.0(LIBVIRT_0.3.0)(64bit) \
libvirt.so.0(LIBVIRT_0.3.2)(64bit) \
libvirt.so.0(LIBVIRT_0.4.1)(64bit) \
libvirt.so.0(LIBVIRT_0.5.0)(64bit) \
libvirt.so.0(LIBVIRT_0.6.0)(64bit) \
libvirt.so.0(LIBVIRT_0.6.4)(64bit) \
libvirt.so.0(LIBVIRT_0.7.1)(64bit) \
libvirt.so.0(LIBVIRT_0.7.2)(64bit) \
libvirt.so.0(LIBVIRT_0.7.3)(64bit) \
libvirt.so.0(LIBVIRT_0.8.0)(64bit) \
libvirt.so.0(LIBVIRT_0.8.2)(64bit) \
libvirt.so.0(LIBVIRT_0.8.6)(64bit) \
libvirt.so.0(LIBVIRT_0.9.0)(64bit) \
libvirt.so.0(LIBVIRT_0.9.10)(64bit) \
libvirt.so.0(LIBVIRT_0.9.11)(64bit) \
libvirt.so.0(LIBVIRT_0.9.13)(64bit) \
libvirt.so.0(LIBVIRT_0.9.2)(64bit) \
libvirt.so.0(LIBVIRT_0.9.4)(64bit) \
libvirt.so.0(LIBVIRT_0.9.5)(64bit) \
libvirt.so.0(LIBVIRT_0.9.7)(64bit) \
libvirt.so.0(LIBVIRT_0.9.8)(64bit) \
libvirt.so.0(LIBVIRT_1.2.5)(64bit) \
libvirt.so.0(LIBVIRT_1.2.6)(64bit) \
libvirt.so.0(LIBVIRT_1.2.7)(64bit) \
libvirt.so.0(LIBVIRT_1.2.8)(64bit) \
libxml2.so.2()(64bit) \
libxml2.so.2(LIBXML2_2.4.30)(64bit) \
libxml2.so.2(LIBXML2_2.5.2)(64bit) \
libxml2.so.2(LIBXML2_2.6.0)(64bit)"

inherit rpm

SUMMARY = "The GNU Image Manipulation Program"
DESCRIPTION = "The GIMP is an image composition and editing program. GIMP offers \
many tools and filters, and provides a large image manipulation \
toolbox and scripting. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of the GIMP libraries."
LICENSE = "GPL-3.0-or-later"

PV = "2.10.34"

RPM_NAME = "gimp-devel-2.10.34-4.1.aarch64.rpm"
RPM_HASH = "1bce9e83caa2a301d0de56713c1e3ecdc6398606c0cceae0ed62d2a487f44b41add74d9bab74652c052210b86c052c0e653e56d5a0178e69744d14cc6936e6ad"

RPROVIDES:${PN} += "gimp-2.0-devel \
gimp-devel \
gimp-devel(aarch-64) \
gimp-doc \
pkgconfig(gimp-2.0) \
pkgconfig(gimpthumb-2.0) \
pkgconfig(gimpui-2.0) \
rpm_macro(gimp_abi_version) \
rpm_macro(gimp_api_version)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgimp-2_0-0 \
libgimpbase-2.0.so.0()(64bit) \
libgimpui-2_0-0 \
libglib-2.0.so.0()(64bit) \
pkgconfig(cairo) \
pkgconfig(gdk-pixbuf-2.0) \
pkgconfig(gegl-0.4) \
pkgconfig(gimp-2.0) \
pkgconfig(gtk+-2.0)"

inherit rpm

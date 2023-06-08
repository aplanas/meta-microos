SUMMARY = "Gerber File Viewer that supports the RS-274X Standard"
DESCRIPTION = "Gerber Viewer (gerbv) is a viewer for Gerber files. Gerber files are \
generated from PCB CAD system and sent to PCB manufacturers as basis \
for the manufacturing process. The standard supported by gerbv is \
RS-274X. The basic difference between RS-274D (the old standard) and \
RS-274X is basically the addition of apertures in RS-274X. It might be \
possible to make an RS-274X file out of an RS-274D file and an \
aperture list."
LICENSE = "GPL-2.0-only"

PV = "2.9.6"

RPM_NAME = "gerbv-2.9.6-1.3.aarch64.rpm"
RPM_HASH = "d675075d3aa833cecc397635a3f1813a9bc9d3afd3029d3abe4db8bbaef39a942e1c5fd22686512cab75d12ed9d747a04462985d6ea843a2b0def1817d34151b"

RPROVIDES:${PN} += "application() application(gerbv.desktop) gerbv gerbv(aarch-64) mimehandler(application/x-excellon) mimehandler(application/x-gerber)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcairo.so.2()(64bit) libgdk-x11-2.0.so.0()(64bit) libgdk_pixbuf-2.0.so.0()(64bit) libgerbv.so.1()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-x11-2.0.so.0()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libm.so.6(GLIBC_2.35)(64bit)"

inherit rpm

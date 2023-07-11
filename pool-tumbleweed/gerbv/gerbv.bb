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

RPM_NAME = "gerbv-2.9.6-1.4.aarch64.rpm"
RPM_HASH = "33f5f4f214fc05007f2a57e458214912f1b180a221ad3e5b58b68c8b47484479a3c1172e845cae7c79b7a12fa4bd6c135124249c67e5d8f5c9a0374b6c50ef2b"

RPROVIDES:${PN} += "gerbv"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-pixbuf-2.0.so.0 \
libgdk-x11-2.0.so.0 \
libgerbv.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libm.so.6"

inherit rpm

SUMMARY = "LXDE Photo Viewer"
DESCRIPTION = "An extremely fast, lightweight, yet feature-rich photo viewer. \
This software is part of the LXDE Desktop Environment."
LICENSE = "GPL-2.0-only"

PV = "0.2.5"

RPM_NAME = "gpicview-0.2.5-2.16.aarch64.rpm"
RPM_HASH = "7688ba2e9755190ff8a8244847ac03160bc8c14c441aedb9746974bcd0d92353caa0a0bede69fb9068ed4535c814833951667538675b59b27cad732dafdbe703"

RPROVIDES:${PN} += "gpicview"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libcairo.so.2 \
libgdk-pixbuf-2.0.so.0 \
libgdk-x11-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libjpeg.so.8 \
libm.so.6"

inherit rpm

SUMMARY = "D-Bus service for Fingerprint reader access"
DESCRIPTION = "The fprint project provides a central system \
to support consumer fingerprint reader devices."
LICENSE = "GPL-2.0-or-later"

PV = "1.94.2"

RPM_NAME = "fprintd-1.94.2-2.5.aarch64.rpm"
RPM_HASH = "71f18d04bb72b49dbbee1108a8d63820e5860c9bfde79c08c6b93df0e3d2a8d64c4c4d55f0479aed78a0cf5484fb2998550df7bac236d22d0958b9b03baa6158"

RPROVIDES:${PN} += "config-fprintd \
fprintd"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfprint-2.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libpolkit-gobject-1.so.0 \
systemd"

inherit rpm

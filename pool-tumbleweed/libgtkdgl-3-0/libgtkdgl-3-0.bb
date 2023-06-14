SUMMARY = "GtkD gtkdgl library"
DESCRIPTION = "This package contains the GtkDGL library."
LICENSE = "LGPL-3.0-or-later"

PV = "3.9.0"

RPM_NAME = "libgtkdgl-3-0-3.9.0-2.12.aarch64.rpm"
RPM_HASH = "fbfc8ee150a88bb20a08457a41e2a1820ca63a4172e70c7204d06207179ee7adf52fa40791f768678b2c6c82d72ab4b030bc6af3869b294b61a86466647c466b"

RPROVIDES:${PN} += "libgtkdgl-3-0 \
libgtkdgl-3.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libdruntime-ldc-shared.so.102"

inherit rpm

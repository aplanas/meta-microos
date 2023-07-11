SUMMARY = "Introspection bindings for gcr, a library for crypto UI related tasks"
DESCRIPTION = "GCR is a library for displaying certificates, and crypto UI, accessing \
key stores. \
 \
This package provides the GObject Introspection bindings for GCR."
LICENSE = "LGPL-2.1-or-later"

PV = "3.41.0"

RPM_NAME = "typelib-1_0-Gcr-3-3.41.0-3.4.aarch64.rpm"
RPM_HASH = "6fb0c26d24baec9f90f3cb30fcecc1735ccbe7d716b51c71299ab5355e52b51a7f6fd2b3c1886a0aedb9114bb76cf9ec26e7c211a3f59a14b4cea2172694c375"

RPROVIDES:${PN} += "typelib-1-0-Gcr-3 \
typelib-Gcr"

RDEPENDS:${PN} += "libgcr-base-3.so.1 \
typelib-1-0-Gck-1 \
typelib-GLib \
typelib-GObject \
typelib-Gck \
typelib-Gio"

inherit rpm

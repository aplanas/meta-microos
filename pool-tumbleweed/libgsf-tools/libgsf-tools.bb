SUMMARY = "Tools from libgsf, a structured file formats handling library"
DESCRIPTION = "The libgsf library is an extensible I/O abstraction library for dealing \
with structured file formats."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.14.50"

RPM_NAME = "libgsf-tools-1.14.50-1.5.aarch64.rpm"
RPM_HASH = "5ed6025f0a4a0adb98212ee1c6532b7d5ad90eebec5b96cbd49e2db4377ae7b4cc9e9682fa260dbeb36c81e138cffad3b9221cbe217300c3150d95edeb740af9"

RPROVIDES:${PN} += "libgsf-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgsf-1.so.114"

inherit rpm

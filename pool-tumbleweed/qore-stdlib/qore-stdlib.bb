SUMMARY = "Standard library modules"
DESCRIPTION = "Qore is a scripting language supporting threading and embedded logic, designed \
for applying a flexible scripting-based approach to enterprise interface \
development but is also useful as a general purpose language. \
 \
This package provides the Qore language standard library user and binary \
modules."
LICENSE = "GPL-2.0-or-later | LGPL-2.1-or-later | MIT"

PV = "1.13.0"

RPM_NAME = "qore-stdlib-1.13.0-1.4.aarch64.rpm"
RPM_HASH = "f69cf8f33c0ef4e0f57948ee702b929f59f56984148d66ec6b890f4361aa6f9943d019af64800ebf957fdf016db348c060ecd05fbb8f9b3420e6f01d40d479f9"

RPROVIDES:${PN} += "qore-stdlib"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libqore12 \
libstdc++.so.6"

inherit rpm

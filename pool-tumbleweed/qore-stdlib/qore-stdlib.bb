SUMMARY = "Standard library modules"
DESCRIPTION = "Qore is a scripting language supporting threading and embedded logic, designed \
for applying a flexible scripting-based approach to enterprise interface \
development but is also useful as a general purpose language. \
 \
This package provides the Qore language standard library user and binary \
modules."
LICENSE = "GPL-2.0-or-later | LGPL-2.1-or-later | MIT"

PV = "1.13.0"

RPM_NAME = "qore-stdlib-1.13.0-1.6.aarch64.rpm"
RPM_HASH = "d37a7a659df1f7eaaf85aeff13fea1adde8a6d27253266311057fef418674c79f519041f60cff27262c7a38e655d6a628713f9138cef67cafc339f0e9ffe0e79"

RPROVIDES:${PN} += "qore-stdlib"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libqore12 \
libstdc++.so.6"

inherit rpm

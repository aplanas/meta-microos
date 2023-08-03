SUMMARY = "Standard library modules"
DESCRIPTION = "Qore is a scripting language supporting threading and embedded logic, designed \
for applying a flexible scripting-based approach to enterprise interface \
development but is also useful as a general purpose language. \
 \
This package provides the Qore language standard library user and binary \
modules."
LICENSE = "GPL-2.0-or-later | LGPL-2.1-or-later | MIT"

PV = "1.16.1"

RPM_NAME = "qore-stdlib-1.16.1-1.1.aarch64.rpm"
RPM_HASH = "b68b7da29a3ce31a33fb4fb895f6a8d30a6e986adefb232d8680ab9faa8aad45f3e5b3878de9f8d499a81258debe951fc276f5ecef401e5930869f0f3a986d79"

RPROVIDES:${PN} += "qore-stdlib"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libqore12 \
libstdc++.so.6"

inherit rpm

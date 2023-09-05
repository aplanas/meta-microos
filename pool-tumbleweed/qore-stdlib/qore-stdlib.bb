SUMMARY = "Standard library modules"
DESCRIPTION = "Qore is a scripting language supporting threading and embedded logic, designed \
for applying a flexible scripting-based approach to enterprise interface \
development but is also useful as a general purpose language. \
 \
This package provides the Qore language standard library user and binary \
modules."
LICENSE = "GPL-2.0-or-later | LGPL-2.1-or-later | MIT"

PV = "1.18.1"

RPM_NAME = "qore-stdlib-1.18.1-1.1.aarch64.rpm"
RPM_HASH = "dc04a379e6f1ace8c8c68adff619d7a4a0e88a8639e7cd12f420a25412503f82b140976cb37316775f92855aa04f5d158641b096fb15ae3019fc124fe65ab041"

RPROVIDES:${PN} += "qore-stdlib"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libqore12 \
libstdc++.so.6"

inherit rpm

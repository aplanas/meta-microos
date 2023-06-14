SUMMARY = "Mono bindings for glib"
DESCRIPTION = "This package contains Mono bindings for glib."
LICENSE = "LGPL-2.1-only"

PV = "2.99.4"

RPM_NAME = "glib-sharp3-2.99.4-6.11.aarch64.rpm"
RPM_HASH = "97a6558a4daf099458b321df56bca217cf1f48ef4e77c6ab76346f6202c2f4295f3aef1b643711d9c53aef6ab77ab9678c28f383f1ff791384d8ba757e69748a"

RPROVIDES:${PN} += "glib-sharp3 \
mono-glib-sharp"

RDEPENDS:${PN} += "mono-mscorlib"

inherit rpm

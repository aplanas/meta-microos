SUMMARY = "Canonical AppMenu Registrar Provider"
DESCRIPTION = "com.canonical.AppMenu.Registrar provider"
LICENSE = "LGPL-3.0-or-later"

PV = "0.7.6"

RPM_NAME = "appmenu-registrar-0.7.6-2.1.aarch64.rpm"
RPM_HASH = "37bb81af4cc46dc4d28d2cba1c987bae0018aaa5cfdbd9470c9388dfe296e2e8477323a2540ef669b9836bc987533b65b61bc1f069503f8ed9130e5e46003ce5"

RPROVIDES:${PN} += "appmenu-registrar"

RDEPENDS:${PN} += "libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm

SUMMARY = "Canonical AppMenu Registrar Provider"
DESCRIPTION = "com.canonical.AppMenu.Registrar provider"
LICENSE = "LGPL-3.0-or-later"

PV = "0.7.6"

RPM_NAME = "appmenu-registrar-0.7.6-1.6.aarch64.rpm"
RPM_HASH = "41dae89f177c808cce5253ea134b6a55c5ec0ec3835c3a239ad1203069e2da1160c796a3fbc6b433fe4a258f3193e910a36f4e4b3ad6d7e7524b894065f468b4"

RPROVIDES:${PN} += "appmenu-registrar \
appmenu-registrar(aarch-64)"

RDEPENDS:${PN} += "libc.so.6()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit)"

inherit rpm

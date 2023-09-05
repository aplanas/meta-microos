SUMMARY = "GClient library of fcitx"
DESCRIPTION = "GClient library of fcitx"
LICENSE = "GPL-2.0-or-later"

PV = "4.2.9.9"

RPM_NAME = "libfcitx-gclient1-4.2.9.9-2.1.aarch64.rpm"
RPM_HASH = "70305f07603161fde270c5e35daa3eb61bc85c9e8db9ac92bc06c62ccc76b9c400a1f9a42218015c2b4d0dc95d97d35e50e5798fe1d715de9431c45ac9e464a1"

RPROVIDES:${PN} += "libfcitx-gclient.so.1 \
libfcitx-gclient1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdbus-1.so.3 \
libfcitx-utils.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm

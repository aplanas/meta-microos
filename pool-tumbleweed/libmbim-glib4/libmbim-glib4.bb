SUMMARY = "Mobile Broadband Interface Model (MBIM) protocol"
DESCRIPTION = "libmbim is a glib-based library for talking to WWAN modems and devices \
which speak the Mobile Broadband Interface Model (MBIM) protocol."
LICENSE = "LGPL-2.1-or-later"

PV = "1.28.4"

RPM_NAME = "libmbim-glib4-1.28.4-1.1.aarch64.rpm"
RPM_HASH = "f5803c9dc2e7b0d0ca4b61c1c4e8022ca338df2800a201323da7d105d45b18ddb7d5e404bfa075deb43e5cd3b8eba01467d267f0c3131dde3858e6ada89bca8d"

RPROVIDES:${PN} += "libmbim-glib.so.4 \
libmbim-glib4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm

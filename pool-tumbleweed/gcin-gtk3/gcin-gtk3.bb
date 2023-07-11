SUMMARY = "Gcin gtk3 immodule"
DESCRIPTION = "gcin gtk3 immodule, support gtk3-based applications"
LICENSE = "LGPL-2.1-only"

PV = "2.9.0"

RPM_NAME = "gcin-gtk3-2.9.0-4.18.aarch64.rpm"
RPM_HASH = "bceeb60b00b910f14ccbcc0662de26aab0b16c689d769432311b5c5bf3a4c3f4ebca3033e6dca3fc57420fdc7816a89f65720d5cdebd90ad0937241c4caddb38"

RPROVIDES:${PN} += "gcin-gtk3 \
gcin-gtk3-immodule"

RDEPENDS:${PN} += "/usr/bin/sh \
gcin \
libc.so.6 \
libgcin-im-client.so.1 \
libgdk-3.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpango-1.0.so.0"

inherit rpm

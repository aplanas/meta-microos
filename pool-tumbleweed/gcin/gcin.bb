SUMMARY = "Chinese input method server"
DESCRIPTION = "gcin is a Chinese input method server for traditional Chinese. \
It features a better GTK user interface."
LICENSE = "LGPL-2.1-only"

PV = "2.9.0"

RPM_NAME = "gcin-2.9.0-4.18.aarch64.rpm"
RPM_HASH = "41c4e46810f1b2a9a66de29e11ab35895ce0a220067bf516a9be5b0c5eda6c971a17c09fcfa7f1f8e7c334fe4d072b3594b6e77e61d54179eaf5469c8b2e1986"

RPROVIDES:${PN} += "gcin \
locale-zh-TW;zh-HK;zh-MO"

RDEPENDS:${PN} += "/usr/bin/bash \
gcin-branding \
gcin-gtk2 \
gcin-gtk3 \
gcin-qt5 \
libX11.so.6 \
libXtst.so.6 \
libc.so.6 \
libcairo.so.2 \
libcurl.so.4 \
libgcin-im-client.so.1 \
libgcin-im-client1 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0"

inherit rpm

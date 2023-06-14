SUMMARY = "Libart Components Licensed under the LGPL"
DESCRIPTION = "Libart is a library for high-performance 2D graphics. It is currently \
being used as the antialiased rendering engine for GNOME Canvas. It is \
also the rendering engine for Gill, the GNOME Illustration application."
LICENSE = "LGPL-2.1-or-later"

PV = "2.3.21"

RPM_NAME = "libart_lgpl_2-2-2.3.21-25.3.aarch64.rpm"
RPM_HASH = "f229448773757a26bdba278799fbca4f9ff0cddb467caceb22772c888f477147a115a5e7beaca7e382229788e15bd809c31ff9069b7942363211564ca5696adc"

RPROVIDES:${PN} += "libart-lgpl \
libart-lgpl-2-2 \
libart-lgpl-2.so.2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm

SUMMARY = "PipeWire integration for KDE Plasma - main library"
DESCRIPTION = "KPipeWire provides PipeWire integration for the Plasma desktop and mobile shells. \
This package contains the main KPipeWire library."
LICENSE = "LGPL-2.0-only & LGPL-3.0-only"

PV = "5.27.7"

RPM_NAME = "libKPipeWire5-5.27.7-1.1.aarch64.rpm"
RPM_HASH = "50cffedf9423eca83751879c6ebd51ff988d3fce412c778cf2acdd86ef21d86d1ac4c984f7c0760a81193b2e3b5c18f2253ec0b865fb84d6e1af2033a9f516cc"

RPROVIDES:${PN} += "libKPipeWire.so.5 \
libKPipeWire5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5I18n.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Quick.so.5 \
libc.so.6 \
libepoxy.so.0 \
libgbm.so.1 \
libpipewire-0.3.so.0 \
libstdc++.so.6"

inherit rpm

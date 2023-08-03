SUMMARY = "JsonRpc 2.0 protocol implementation"
DESCRIPTION = "JsonRpc 2.0 protocol implementation for Qt6."
LICENSE = "LGPL-3.0-only | GPL-2.0-or-later"

PV = "6.5.2"

RPM_NAME = "libQt6JsonRpc6-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "5e8096dbe2a9ec43dd95ad0a56ef954391fdf3c400efb179688dfceb455191f79e6178396a4727aab7205e98e90bbbcea269662ee08c14b037ffb17e1a61d21b"

RPROVIDES:${PN} += "libQt6JsonRpc.so.6 \
libQt6JsonRpc6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm

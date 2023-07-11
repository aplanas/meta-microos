SUMMARY = "GTK GUI implementation of Audacious"
DESCRIPTION = "Library from the Audacious audio player."
LICENSE = "BSD-2-Clause"

PV = "4.3.1"

RPM_NAME = "libaudgui5-4.3.1-1.1.aarch64.rpm"
RPM_HASH = "cef6d8823c9228f84341adc34a149787d3e1e0c226b1c30ab6765d3bb8e5a7b92ed7999ed9f3e9570404cf292fbebe8b15c1806eed30604964e14298474efadd"

RPROVIDES:${PN} += "libaudgui.so.5 \
libaudgui5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libaudcore.so.5 \
libaudcore5 \
libc.so.6 \
libcairo.so.2 \
libgcc-s.so.1 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpango-1.0.so.0 \
libstdc++.so.6"

inherit rpm

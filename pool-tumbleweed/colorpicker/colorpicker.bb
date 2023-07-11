SUMMARY = "A Color Picker"
DESCRIPTION = "A color picker program designed for Elementary OS."
LICENSE = "GPL-3.0-or-later"

PV = "1.1.5"

RPM_NAME = "colorpicker-1.1.5-1.18.aarch64.rpm"
RPM_HASH = "8a5ac88a2cbfc70243c316e62075780928243b6145ec31cf81c93ebe96140ec5982a7fd3fb3f70c11f5d7a6556173c778f027cabd881118ccefe73d8e5b9fdcd"

RPROVIDES:${PN} += "colorpicker"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgee-0.8.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgranite.so.6 \
libgtk-3.so.0"

inherit rpm

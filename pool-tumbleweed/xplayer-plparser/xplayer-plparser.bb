SUMMARY = "Simple GObject-based library to parse playlist formats"
DESCRIPTION = "xplayer-plparser is a simple GObject-based library to parse a host \
of playlist formats, to save them too."
LICENSE = "LGPL-2.0-or-later"

PV = "1.0.2"

RPM_NAME = "xplayer-plparser-1.0.2-2.12.aarch64.rpm"
RPM_HASH = "94c885a94094e65e2be030eb1a05f1ed614986c5826b0602a95b3252332889da8379327e08cb63a67b6cd5690cce77b99f0e7581c299227f6fede39ba7a16a0f"

RPROVIDES:${PN} += "xplayer-plparser"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libquvi-0.9-0.9.4.so \
libquvi-scripts"

inherit rpm

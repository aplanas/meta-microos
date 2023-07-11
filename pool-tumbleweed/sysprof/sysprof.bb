SUMMARY = "A system-wide Linux profiler"
DESCRIPTION = "Sysprof is a sampling CPU profiler for Linux that collects accurate, \
high-precision data and provides efficient access to the sampled \
calltrees."
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "3.48.0"

RPM_NAME = "sysprof-3.48.0-2.2.aarch64.rpm"
RPM_HASH = "325b5df1c80860ab5c3b972128b0e37993fc03b9938547b9f3d067a3dcee18f21f91e967bd90a545fde5ce0c4de21310b09f87a05ba3029f439f4f3b46018b6a"

RPROVIDES:${PN} += "libsysprof-4.so \
libsysprof-memory-4.so \
libsysprof-speedtrack-4.so \
sysprof"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libjson-glib-1.0.so.0 \
libpolkit-agent-1.so.0 \
libpolkit-gobject-1.so.0 \
libstdc++.so.6 \
libunwind.so.8"

inherit rpm

SUMMARY = "A system-wide Linux profiler"
DESCRIPTION = "Sysprof is a sampling CPU profiler for Linux that collects accurate, \
high-precision data and provides efficient access to the sampled \
calltrees."
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "3.48.0"

RPM_NAME = "sysprof-ui-3.48.0-2.1.aarch64.rpm"
RPM_HASH = "29b0fb677a4617a59e36d1d63a5311531e609eb3a928b77bd8e7d1b3564adf9e2a18c4ad56d2c3547ba07d389b9e26ffe192e7c7cac0538ce2d4c731341cb803"

RPROVIDES:${PN} += "libsysprof-ui-5.so \
sysprof-ui"

RDEPENDS:${PN} += "/usr/bin/sh \
hicolor-icon-theme \
ld-linux-aarch64.so.1 \
libadwaita-1.so.0 \
libc.so.6 \
libcairo.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgraphene-1.0.so.0 \
libgtk-4.so.1 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libsysprof-4.so"

inherit rpm

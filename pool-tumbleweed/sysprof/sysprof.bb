SUMMARY = "A system-wide Linux profiler"
DESCRIPTION = "Sysprof is a sampling CPU profiler for Linux that collects accurate, \
high-precision data and provides efficient access to the sampled \
calltrees."
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "3.48.0"

RPM_NAME = "sysprof-3.48.0-2.1.aarch64.rpm"
RPM_HASH = "e0d6ddd4187167f4a719af4120db896e239a261053c514f6b95333e286166dbce036bd640e3e2421143e344bddfe4420ab47419b3387acc2ce888aae3599e68d"

RPROVIDES:${PN} += "libsysprof-4.so \
libsysprof-memory-4.so \
libsysprof-speedtrack-4.so \
sysprof"

RDEPENDS:${PN} += "/bin/sh \
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

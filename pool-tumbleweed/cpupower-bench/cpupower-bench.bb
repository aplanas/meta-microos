SUMMARY = "CPU frequency micro benchmark"
DESCRIPTION = "This benchmark helps to test the condition of a given kernel cpufreq \
governor (e.g. ondemand, userspace, conservative) and the cpufreq HW driver \
(e.g. powernow-k8, acpi-cpufreq, ...). \
For that purpose, it compares the performance governor to a configured \
powersave module."
LICENSE = "GPL-2.0-only"

PV = "6.4.2"

RPM_NAME = "cpupower-bench-6.4.2-4.16.aarch64.rpm"
RPM_HASH = "95ab4287c907f32c7449081264d98a9ddf0bd615b5786abfdb159d8b17d45551707b85ed8919562d933a281270e7037a69412a51a1a4f34ddedb257e78c7ce71"

RPROVIDES:${PN} += "config-cpupower-bench \
cpupower-bench"

RDEPENDS:${PN} += "/usr/bin/bash \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcpupower.so.0 \
libm.so.6"

inherit rpm

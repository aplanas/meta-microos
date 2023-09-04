SUMMARY = "CPU frequency micro benchmark"
DESCRIPTION = "This benchmark helps to test the condition of a given kernel cpufreq \
governor (e.g. ondemand, userspace, conservative) and the cpufreq HW driver \
(e.g. powernow-k8, acpi-cpufreq, ...). \
For that purpose, it compares the performance governor to a configured \
powersave module."
LICENSE = "GPL-2.0-only"

PV = "6.4.11"

RPM_NAME = "cpupower-bench-6.4.11-4.22.aarch64.rpm"
RPM_HASH = "14b0a3cf0dd61f1ecf70921e45debd4007fc9238739da583061f37616d1f5667ae1244bee7a197cc2b5502abc66cb49b52d583db61d7d11b4d0ab668842b9a28"

RPROVIDES:${PN} += "config-cpupower-bench \
cpupower-bench"

RDEPENDS:${PN} += "/usr/bin/bash \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcpupower.so.0 \
libm.so.6"

inherit rpm

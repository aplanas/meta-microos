SUMMARY = "CPU frequency micro benchmark"
DESCRIPTION = "This benchmark helps to test the condition of a given kernel cpufreq \
governor (e.g. ondemand, userspace, conservative) and the cpufreq HW driver \
(e.g. powernow-k8, acpi-cpufreq, ...). \
For that purpose, it compares the performance governor to a configured \
powersave module."
LICENSE = "GPL-2.0-only"

PV = "6.3.9"

RPM_NAME = "cpupower-bench-6.3.9-4.15.aarch64.rpm"
RPM_HASH = "d56ef4b3f148b4e85151ef5680b12d808581b8dff06d8f3300469e5023ca377ee9b423e60610c610e2c1c4a590825cdf95c81985268122647e548adc8c0077ed"

RPROVIDES:${PN} += "config-cpupower-bench \
cpupower-bench"

RDEPENDS:${PN} += "/usr/bin/bash \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcpupower.so.0 \
libm.so.6"

inherit rpm

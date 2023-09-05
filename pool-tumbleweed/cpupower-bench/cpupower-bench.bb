SUMMARY = "CPU frequency micro benchmark"
DESCRIPTION = "This benchmark helps to test the condition of a given kernel cpufreq \
governor (e.g. ondemand, userspace, conservative) and the cpufreq HW driver \
(e.g. powernow-k8, acpi-cpufreq, ...). \
For that purpose, it compares the performance governor to a configured \
powersave module."
LICENSE = "GPL-2.0-only"

PV = "6.4.12"

RPM_NAME = "cpupower-bench-6.4.12-4.23.aarch64.rpm"
RPM_HASH = "1cd7f19d6d14f4b545fd85e31ade1ae374a85afd1ed45738da4c7db58cd9f5d7a92d78025cd6364bb81b549c2c32f0351d04e82ca1a210440b85b9f6372763bd"

RPROVIDES:${PN} += "config-cpupower-bench \
cpupower-bench"

RDEPENDS:${PN} += "/usr/bin/bash \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcpupower.so.0 \
libm.so.6"

inherit rpm

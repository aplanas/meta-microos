SUMMARY = "CPU frequency micro benchmark"
DESCRIPTION = "This benchmark helps to test the condition of a given kernel cpufreq \
governor (e.g. ondemand, userspace, conservative) and the cpufreq HW driver \
(e.g. powernow-k8, acpi-cpufreq, ...). \
For that purpose, it compares the performance governor to a configured \
powersave module."
LICENSE = "GPL-2.0-only"

PV = "6.4.6"

RPM_NAME = "cpupower-bench-6.4.6-4.19.aarch64.rpm"
RPM_HASH = "6697067602daeebc1fd38ae647e77f0efdbf365d887ec12a55bb744724d56557d3418cbd9f751d19fd4129c8df22e2f154ebf0f556fb2aa67531321dd4d27b5a"

RPROVIDES:${PN} += "config-cpupower-bench \
cpupower-bench"

RDEPENDS:${PN} += "/usr/bin/bash \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcpupower.so.0 \
libm.so.6"

inherit rpm

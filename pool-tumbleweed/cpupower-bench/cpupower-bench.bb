SUMMARY = "CPU frequency micro benchmark"
DESCRIPTION = "This benchmark helps to test the condition of a given kernel cpufreq \
governor (e.g. ondemand, userspace, conservative) and the cpufreq HW driver \
(e.g. powernow-k8, acpi-cpufreq, ...). \
For that purpose, it compares the performance governor to a configured \
powersave module."
LICENSE = "GPL-2.0-only"

PV = "6.4.3"

RPM_NAME = "cpupower-bench-6.4.3-4.17.aarch64.rpm"
RPM_HASH = "9d15ace38532436abe4fc6deac3a32ba40e86dc287d4c9968fa9b3db72eef6a3d0ddc74cdb541c29cef9753455319ce4bc64acb7795226201762138116508af8"

RPROVIDES:${PN} += "config-cpupower-bench \
cpupower-bench"

RDEPENDS:${PN} += "/usr/bin/bash \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcpupower.so.0 \
libm.so.6"

inherit rpm

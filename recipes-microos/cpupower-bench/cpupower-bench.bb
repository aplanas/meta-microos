SUMMARY = "CPU frequency micro benchmark"
DESCRIPTION = "This benchmark helps to test the condition of a given kernel cpufreq \
governor (e.g. ondemand, userspace, conservative) and the cpufreq HW driver \
(e.g. powernow-k8, acpi-cpufreq, ...). \
For that purpose, it compares the performance governor to a configured \
powersave module."
LICENSE = "GPL-2.0-only"

PV = "6.3.1"

RPM_NAME = "cpupower-bench-6.3.1-4.10.aarch64.rpm"
RPM_HASH = "897a381a4198a4befcdeef95bfde754a0e732883f90b14aef826892099feff7f824de617989e951d456640275831298bcb1d7773a196f6a1db36ff40d7522cb3"

RPROVIDES:${PN} += "config(cpupower-bench) cpupower-bench cpupower-bench(aarch-64)"
RDEPENDS:${PN} += "/bin/bash ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcpupower.so.0()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm

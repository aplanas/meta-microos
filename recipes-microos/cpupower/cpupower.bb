SUMMARY = "Tools to determine and set CPU Power related Settings"
DESCRIPTION = "This tool accesses the Linux kernel's processor power subsystems \
like CPU frequency switching (cpufreq) or CPU sleep states (cpuidle)."
LICENSE = "GPL-2.0-only"

PV = "6.3.1"

RPM_NAME = "cpupower-6.3.1-4.10.aarch64.rpm"
RPM_HASH = "6dc3b95d86102602eadb64719cfb63eefe51b42ed170bc693eb535867026fc732b2155f78dba05e7d0fac291e9091d6086d08da86170d3e43d13e78232e9606c"

RPROVIDES:${PN} += "cpupower cpupower(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcpupower.so.0()(64bit)"

inherit rpm

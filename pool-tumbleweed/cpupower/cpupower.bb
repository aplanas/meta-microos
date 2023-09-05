SUMMARY = "Tools to determine and set CPU Power related Settings"
DESCRIPTION = "This tool accesses the Linux kernel's processor power subsystems \
like CPU frequency switching (cpufreq) or CPU sleep states (cpuidle)."
LICENSE = "GPL-2.0-only"

PV = "6.4.12"

RPM_NAME = "cpupower-6.4.12-4.23.aarch64.rpm"
RPM_HASH = "8a27b322a7b90912dbed971a7b16bf90ac30566c205d9bbf38549a5bf8cf8c83ef27e3e5f8135fe0574171400c4f33525d676756a1bc9ce61e0e999c2a4375af"

RPROVIDES:${PN} += "cpupower"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcpupower.so.0"

inherit rpm

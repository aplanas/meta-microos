SUMMARY = "Tools to determine and set CPU Power related Settings"
DESCRIPTION = "This tool accesses the Linux kernel's processor power subsystems \
like CPU frequency switching (cpufreq) or CPU sleep states (cpuidle)."
LICENSE = "GPL-2.0-only"

PV = "6.4.3"

RPM_NAME = "cpupower-6.4.3-4.17.aarch64.rpm"
RPM_HASH = "9a48ca5511991a720e264f8027b2c2623ba0d2318f87987df162e57d739d658ec8e96257dc24d7e9838cbf12992ea9627cde7eba8557d8cca774b771bdc0a009"

RPROVIDES:${PN} += "cpupower"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcpupower.so.0"

inherit rpm

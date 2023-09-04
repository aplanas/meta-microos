SUMMARY = "Tools to determine and set CPU Power related Settings"
DESCRIPTION = "This tool accesses the Linux kernel's processor power subsystems \
like CPU frequency switching (cpufreq) or CPU sleep states (cpuidle)."
LICENSE = "GPL-2.0-only"

PV = "6.4.11"

RPM_NAME = "cpupower-6.4.11-4.22.aarch64.rpm"
RPM_HASH = "a2a8acd2f730b16be8f5db49319d875092de392ee6ebaeb8b4e01309c09d0a4d8bcc9ccaf71428df4db988881b1e8ed21390b7708b51c58fce5af0224cc79d6c"

RPROVIDES:${PN} += "cpupower"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcpupower.so.0"

inherit rpm

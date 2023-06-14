SUMMARY = "Tools to determine and set CPU Power related Settings"
DESCRIPTION = "This tool accesses the Linux kernel's processor power subsystems \
like CPU frequency switching (cpufreq) or CPU sleep states (cpuidle)."
LICENSE = "GPL-2.0-only"

PV = "6.3.4"

RPM_NAME = "cpupower-6.3.4-4.12.aarch64.rpm"
RPM_HASH = "ced772caccdade29a19109b2ff7f46c08f40e231bae84c3d3c409f048efacd5d514a026ed7d9ba27d25a9ec73e01f66deb325f9cb298c47c2178f579a691e6e9"

RPROVIDES:${PN} += "cpupower"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcpupower.so.0"

inherit rpm

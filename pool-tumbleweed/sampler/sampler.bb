SUMMARY = "A tool for shell commands execution, visualization and alerting"
DESCRIPTION = "Sampler is a tool for shell commands execution, visualization and alerting. Configured with a simple YAML file."
LICENSE = "GPL-3.0-only"

PV = "1.1.0"

RPM_NAME = "sampler-1.1.0-2.12.aarch64.rpm"
RPM_HASH = "b1eb9dd725669ae555bfd09e15a7cee32c02bbd6a60f128c0fdfb7c411c3607f0cbab68ec604b9ec10637a74c471c24808672fb6d8c0c26226233e53b14869bb"

RPROVIDES:${PN} += "sampler \
sampler(aarch-64)"

RDEPENDS:${PN} += "libasound.so.2()(64bit) \
libasound.so.2(ALSA_0.9)(64bit) \
libasound.so.2(ALSA_0.9.0rc4)(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm

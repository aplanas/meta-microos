SUMMARY = "Gkrellm plugin - CPU Frequency"
DESCRIPTION = "A gkrellm2 plugin for displaying and manipulating CPU frequency"
LICENSE = "GPL-2.0+"

PV = "0.2"

RPM_NAME = "gkrellm-cpupower-0.2-2.29.aarch64.rpm"
RPM_HASH = "a769fb575865b67d02d5e999874b855afc71695eae798a8c38f659de2b2ab97b6b69157e89b8d42f50bad543e37365cec36fd692dc133c9e7ce0be9aff55c352"

RPROVIDES:${PN} += "gkrellm-cpufreq \
gkrellm-cpupower"

RDEPENDS:${PN} += "cpupower \
gkrellm \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcpupower.so.0 \
libgdk-x11-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0"

inherit rpm

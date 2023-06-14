SUMMARY = "Gkrellm plugin - CPU Frequency"
DESCRIPTION = "A gkrellm2 plugin for displaying and manipulating CPU frequency"
LICENSE = "GPL-2.0+"

PV = "0.2"

RPM_NAME = "gkrellm-cpupower-0.2-2.28.aarch64.rpm"
RPM_HASH = "ad0b8a0670bbadebc20e7a83afa74b572d108bfae1606dc9392633940700ca8777acc7a6275a669a441c1295a179eceb80deccc297d3ec2ae4e5387bac73e19a"

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

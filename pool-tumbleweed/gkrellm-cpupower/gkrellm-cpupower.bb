SUMMARY = "Gkrellm plugin - CPU Frequency"
DESCRIPTION = "A gkrellm2 plugin for displaying and manipulating CPU frequency"
LICENSE = "GPL-2.0+"

PV = "0.2"

RPM_NAME = "gkrellm-cpupower-0.2-2.28.aarch64.rpm"
RPM_HASH = "ad0b8a0670bbadebc20e7a83afa74b572d108bfae1606dc9392633940700ca8777acc7a6275a669a441c1295a179eceb80deccc297d3ec2ae4e5387bac73e19a"

RPROVIDES:${PN} += "gkrellm-cpufreq \
gkrellm-cpupower \
gkrellm-cpupower(aarch-64)"

RDEPENDS:${PN} += "cpupower \
gkrellm \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcpupower.so.0()(64bit) \
libgdk-x11-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-x11-2.0.so.0()(64bit)"

inherit rpm

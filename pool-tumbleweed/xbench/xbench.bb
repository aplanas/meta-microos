SUMMARY = "Benchmark for X11"
DESCRIPTION = "A benchmark for X11."
LICENSE = "SUSE-Public-Domain"

PV = "0.2"

RPM_NAME = "xbench-0.2-1242.10.aarch64.rpm"
RPM_HASH = "626d379a9faee1a5e825334d06fccdaedfec2c0ad8d94bf3a3f2d5bc81eede37decee687f347785d3e17480b408e065343057e837a0afa3806a65d491d5a0a41"

RPROVIDES:${PN} += "xbench \
xbench(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11.so.6()(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm

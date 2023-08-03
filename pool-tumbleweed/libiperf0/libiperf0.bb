SUMMARY = "A library to measure network performance"
DESCRIPTION = "libiperf gives you access to all the functionality of the iperf3 \
network testing tool. \
You can build it directly into your own program, instead of having \
to run it as a shell command."
LICENSE = "BSD-3-Clause"

PV = "3.14"

RPM_NAME = "libiperf0-3.14-1.1.aarch64.rpm"
RPM_HASH = "5eed873f3785d52a1b188d10d06b66877aa59b791dc08d444b9e3949b113a0963e3cdcd9b7b0f2c9763f38349d7088686c14efbddfa7c8d47bec9a4ad83b96fc"

RPROVIDES:${PN} += "libiperf.so.0 \
libiperf0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm

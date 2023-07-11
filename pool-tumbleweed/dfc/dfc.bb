SUMMARY = "Display file system space usage using graphs and colors"
DESCRIPTION = "dfc is a simple tool that displays file system space usage using graphs and \
colors."
LICENSE = "BSD-3-Clause"

PV = "3.1.1"

RPM_NAME = "dfc-3.1.1-3.1.aarch64.rpm"
RPM_HASH = "941e39b993a888880c52a2ee0f6a0072f99bcd3f805cf15ed743ed0a134579218aa84841421c2874555f15751ca7d29df184a56c256019b184c40753215ed035"

RPROVIDES:${PN} += "config-dfc \
dfc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm

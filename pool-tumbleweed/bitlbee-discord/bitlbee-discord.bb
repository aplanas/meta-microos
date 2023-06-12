SUMMARY = "Bitlbee plugin for Discord"
DESCRIPTION = "Bitlbee plugin for Discord."
LICENSE = "GPL-2.0-only"

PV = "0.4.3+7.g607f988"

RPM_NAME = "bitlbee-discord-0.4.3+7.g607f988-1.9.aarch64.rpm"
RPM_HASH = "2c4fbffc8ddf87d37d47486ab7fc665d2333c183018ffb0207685581b88e3101306a1d778963a7af2e6386d47d4cd5316f6b69acd3fab3a690b838cc7a8a3ffe"

RPROVIDES:${PN} += "bitlbee-discord \
bitlbee-discord(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libglib-2.0.so.0()(64bit)"

inherit rpm

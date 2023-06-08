SUMMARY = "Steam protocol plugin for BitlBee"
DESCRIPTION = "Steam protocol plugin for BitlBee"
LICENSE = "GPL-2.0"

PV = "1.4.2"

RPM_NAME = "bitlbee-steam-1.4.2-1.27.aarch64.rpm"
RPM_HASH = "eb6dd7e1028be73bc73c79dff04e7142617b749990769132190cf60f5e8f2a0d9d00a114de3bfa3dfbe172e57b5a88bec0ea0980e9f84ef6374df1f13afc188f"

RPROVIDES:${PN} += "bitlbee-steam bitlbee-steam(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcrypt.so.20()(64bit) libgcrypt.so.20(GCRYPT_1.6)(64bit) libglib-2.0.so.0()(64bit)"

inherit rpm

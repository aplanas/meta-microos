SUMMARY = "C library for generating TOTP and HOTP"
DESCRIPTION = "libcotp C library for generating TOTP and HOTP according to RFC-6238. \
It supports custom digits, (3 to 10) custom period (1 to 120 seconds) and \
also Steam TOTP format."
LICENSE = "Apache-2.0"

PV = "2.0.1"

RPM_NAME = "libcotp2-2.0.1-1.1.aarch64.rpm"
RPM_HASH = "9b4364822cf1bdd80be1122116eb09006a66b422d522d855d62fbfb839a51da4b5fae852b004876d72b9df3d699e4fc21af06de9f077e2308f02805ca84c79b4"

RPROVIDES:${PN} += "libcotp.so.2()(64bit) \
libcotp2 \
libcotp2(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcrypt.so.20()(64bit)"

inherit rpm

SUMMARY = "Audio-Visual Demonstration for Text Terminal"
DESCRIPTION = "BB is a high quality audio-visual demonstration for your text terminal. \
 It is a portable demo, so you can run it on plenty of operating \
systems and DOS."
LICENSE = "GPL-2.0+"

PV = "1.3"

RPM_NAME = "bb-1.3-575.24.aarch64.rpm"
RPM_HASH = "d79daa388b09a6b646a27ba9f535a93d5ff1134a76fc1751f9ab66297319394130bbd2d44fbcde142b4db905fb4df8760e70bf9ba365c167e724c895547687b4"

RPROVIDES:${PN} += "bb"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libaa.so.1 \
libc.so.6 \
liblzo2.so.2 \
libm.so.6 \
libmikmod.so.3"

inherit rpm

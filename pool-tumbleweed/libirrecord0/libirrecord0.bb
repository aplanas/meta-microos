SUMMARY = "LIRC record library"
DESCRIPTION = "The LIRC record library. To actually use the lirc plugins."
LICENSE = "GPL-2.0-or-later"

PV = "0.10.1"

RPM_NAME = "libirrecord0-0.10.1-10.1.aarch64.rpm"
RPM_HASH = "5b2e07d2ede8b1f08d77d235f7ec8ae9112a96b5f0bc86df4a9e58dc656f8100b143d8faef565a7339e45fc21aac9a1908217f8f80ce83371178c335fbadb526"

RPROVIDES:${PN} += "libirrecord.so.0()(64bit) \
libirrecord0 \
libirrecord0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
liblirc.so.0()(64bit)"

inherit rpm

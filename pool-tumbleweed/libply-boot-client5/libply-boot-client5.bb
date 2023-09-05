SUMMARY = "Plymouth core library"
DESCRIPTION = "This package contains the libply-boot-client library used by Plymouth."
LICENSE = "GPL-2.0-or-later"

PV = "22.02.122+94.4bd41a3"

RPM_NAME = "libply-boot-client5-22.02.122+94.4bd41a3-10.1.aarch64.rpm"
RPM_HASH = "6173789c575c5dc428a71b358f92efc9fdc7e01040c2545a314a299bacd0f189b4bb9ae630914f7b158ad3aeeff5b4ddf1e80c7a83cfb62dd1a3ae4c5f19a50b"

RPROVIDES:${PN} += "libply-boot-client.so.5 \
libply-boot-client5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libply.so.5"

inherit rpm

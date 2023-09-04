SUMMARY = "Plymouth core library"
DESCRIPTION = "This package contains the libply-boot-client library used by Plymouth."
LICENSE = "GPL-2.0-or-later"

PV = "22.02.122+94.4bd41a3"

RPM_NAME = "libply-boot-client5-22.02.122+94.4bd41a3-9.1.aarch64.rpm"
RPM_HASH = "09f26279addd81fe88dcb259ba09a71605be372a62086d2bbd54fd0d158b5d2b49f32ee1238074d6452ad4e2c76128ff7f2dd3757248e175ee173a891f100c43"

RPROVIDES:${PN} += "libply-boot-client.so.5 \
libply-boot-client5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libply.so.5"

inherit rpm

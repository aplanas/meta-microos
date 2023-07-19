SUMMARY = "Plymouth core library"
DESCRIPTION = "This package contains the libply-boot-client library used by Plymouth."
LICENSE = "GPL-2.0-or-later"

PV = "22.02.122+94.4bd41a3"

RPM_NAME = "libply-boot-client5-22.02.122+94.4bd41a3-6.1.aarch64.rpm"
RPM_HASH = "56a6300dd2d27c3f1f7b72e01bc35b8e00da145448a5751df0f535ce1abc12d42631ea81a26c51c33b4ff77d9345b2786bc06e63f1e5b40f65919939d9586a72"

RPROVIDES:${PN} += "libply-boot-client.so.5 \
libply-boot-client5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libply.so.5"

inherit rpm

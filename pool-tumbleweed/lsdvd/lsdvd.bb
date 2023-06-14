SUMMARY = "A ls for video DVDs"
DESCRIPTION = "A tool to display the directory of a video DVDs"
LICENSE = "GPL-2.0"

PV = "0.17"

RPM_NAME = "lsdvd-0.17-1.22.aarch64.rpm"
RPM_HASH = "c31e2b4ef23cbbecf3745e0b0ca09a01cadaf4b8d9d84faf32dc8964f39be3c8effc8b9c336188274f3e6f4c29467b5e1eaeeb5d53f9e1f253ea59134dccc623"

RPROVIDES:${PN} += "lsdvd"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdvdread.so.8"

inherit rpm

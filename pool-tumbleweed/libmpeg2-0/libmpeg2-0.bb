SUMMARY = "MPEG-2 Video Stream Decoder"
DESCRIPTION = "libmpeg2 is a library for decoding MPEG-1 and MPEG-2 video streams."
LICENSE = "GPL-2.0-or-later"

PV = "0.5.1"

RPM_NAME = "libmpeg2-0-0.5.1-3.13.aarch64.rpm"
RPM_HASH = "7ce9943fd508a053885ca8ded7a7ce4ccf166f76fef17e32b6435dad33e82482df61529f81f592c6f0150b0a8218d07c11bf476b7701d50e57fc2a5ed83e0c80"

RPROVIDES:${PN} += "libmpeg2-0 \
libmpeg2.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm

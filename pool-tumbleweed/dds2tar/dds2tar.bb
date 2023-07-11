SUMMARY = "DDS2 Tape Streamer Utilities"
DESCRIPTION = "A tool for quick extraction of individual files from a DDS2 streamer. \
dds2tar can control data compression for HP DAT streamers."
LICENSE = "GPL-2.0-or-later"

PV = "2.5.2"

RPM_NAME = "dds2tar-2.5.2-1333.1.aarch64.rpm"
RPM_HASH = "281f53da84686680c541f3b6cdbe603cb0b379c05f40407125c68247cf0aeb17689654b588937cb87f6870e3954435ce18fef0e6e9c131a0a21485be94774229"

RPROVIDES:${PN} += "dds2tar"

RDEPENDS:${PN} += "/usr/bin/csh \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm

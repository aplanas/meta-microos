SUMMARY = "Wireshark library for tapping"
DESCRIPTION = "Wiretap, part of the Wireshark project, is a library that allows one to read \
and write several packet capture file formats."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "4.0.7"

RPM_NAME = "libwiretap13-4.0.7-2.1.aarch64.rpm"
RPM_HASH = "1b7dce0eee5d525633f90619a8b324c0cb55b9da90efab24f63dc36f8e3795c796230cce0c98b2d5991bc4817a41a8a5d57c1a6266ba16ad7dbf117122bc3d33"

RPROVIDES:${PN} += "libwiretap.so.13 \
libwiretap13"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
liblz4.so.1 \
libwsutil.so.14 \
libz.so.1 \
libzstd.so.1"

inherit rpm

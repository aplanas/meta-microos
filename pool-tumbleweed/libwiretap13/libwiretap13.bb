SUMMARY = "Wireshark library for tapping"
DESCRIPTION = "Wiretap, part of the Wireshark project, is a library that allows one to read \
and write several packet capture file formats."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "4.0.8"

RPM_NAME = "libwiretap13-4.0.8-2.1.aarch64.rpm"
RPM_HASH = "1c2b83d7cad70d7099d095f269c4882c294780e045fad67105a707345de3fbb15112bb1508e5e980bcc01369b7b107b25f35d3a50d4c04511f9996b964d37544"

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

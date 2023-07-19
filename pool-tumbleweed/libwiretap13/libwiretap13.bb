SUMMARY = "Wireshark library for tapping"
DESCRIPTION = "Wiretap, part of the Wireshark project, is a library that allows one to read \
and write several packet capture file formats."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "4.0.7"

RPM_NAME = "libwiretap13-4.0.7-1.1.aarch64.rpm"
RPM_HASH = "8f664677a6d62826552c7672d05c4d0a4ced80b2ba2a81625efc68e4a2b53f41434e6ec2e66510bc1009e173ff762c8c38fafeab0e1f7db932ff77aee24baea5"

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

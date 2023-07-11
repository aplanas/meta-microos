SUMMARY = "Protocol Decoder Library for sigrok"
DESCRIPTION = "The sigrok project aims at creating a portable, cross-platform, \
Free/Libre/Open-Source logic analyzer software that supports various \
logic analyzer hardware products. \
 \
libsigrokdecode is a shared library written in C which provides the basic \
API for running sigrok protocol decoders. The protocol decoders themselves \
are written in Python."
LICENSE = "GPL-3.0-or-later"

PV = "0.5.3"

RPM_NAME = "libsigrokdecode4-0.5.3-2.5.aarch64.rpm"
RPM_HASH = "87dd05164fc67df46150d0e34a99a2b7b9f5cab0564ec9cddb6f02a4ee529cf5fcb37db0322113a253f23f25de08632e9ba5293ecfee7e7dc712e10c45f086e2"

RPROVIDES:${PN} += "libsigrokdecode.so.4 \
libsigrokdecode4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libpython3.11.so.1.0 \
python3-base"

inherit rpm

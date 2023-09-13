SUMMARY = "Zone record parsing functions for Knot DNS"
DESCRIPTION = "Knot DNS is a DNS server. It implements only the authoritative domain \
name service. It uses a multi-threaded and mostly lock-free \
implementation and can operate non-stop during zone addition or \
removal. \
 \
This package contains a library for a zone record scanner."
LICENSE = "GPL-3.0-or-later"

PV = "3.3.0"

RPM_NAME = "libzscanner4-3.3.0-1.1.aarch64.rpm"
RPM_HASH = "7c466320d00e4b8a02073f709000bdafd09328d8d02849bcd3af8318f9b8d069b05bfab03fed6d4f015bf748873ab4641076bd6bda861a4451ed55109159f4a5"

RPROVIDES:${PN} += "libzscanner.so.4 \
libzscanner4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm

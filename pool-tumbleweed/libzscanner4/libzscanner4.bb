SUMMARY = "Zone record parsing functions for Knot DNS"
DESCRIPTION = "Knot DNS is a DNS server. It implements only the authoritative domain \
name service. It uses a multi-threaded and mostly lock-free \
implementation and can operate non-stop during zone addition or \
removal. \
 \
This package contains a library for a zone record scanner."
LICENSE = "GPL-3.0-or-later"

PV = "3.2.8"

RPM_NAME = "libzscanner4-3.2.8-1.1.aarch64.rpm"
RPM_HASH = "4ee1cbd848abbc193572c760fb63df611517d66266361d4c5da65329f875ce5c6a9f0c7992a3b40453f5679aaf0a4d7467fb4287089d48cca2793f69c5b12f85"

RPROVIDES:${PN} += "libzscanner.so.4 \
libzscanner4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm

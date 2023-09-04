SUMMARY = "Zone record parsing functions for Knot DNS"
DESCRIPTION = "Knot DNS is a DNS server. It implements only the authoritative domain \
name service. It uses a multi-threaded and mostly lock-free \
implementation and can operate non-stop during zone addition or \
removal. \
 \
This package contains a library for a zone record scanner."
LICENSE = "GPL-3.0-or-later"

PV = "3.2.9"

RPM_NAME = "libzscanner4-3.2.9-1.1.aarch64.rpm"
RPM_HASH = "4ebcfa480121a3db9bfe6b4566cb0ecf13af7b5f699161b0900ed79f7859f8afc6419078ba8d7489e65b3fafb8e84c1387a585ab00c20b5ba7c19b6d7d5a5053"

RPROVIDES:${PN} += "libzscanner.so.4 \
libzscanner4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm

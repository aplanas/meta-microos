SUMMARY = "DNSSEC support functions for Knot DNS"
DESCRIPTION = "Knot DNS is a DNS server. It implements only the authoritative domain \
name service. It uses a multi-threaded and mostly lock-free \
implementation and can operate non-stop during zone addition or \
removal. \
 \
This package contains a library for DNSSEC support functions."
LICENSE = "GPL-3.0-or-later"

PV = "3.2.8"

RPM_NAME = "libdnssec9-3.2.8-1.1.aarch64.rpm"
RPM_HASH = "61d1cadcb39b2a5a816b97bf5ebe4947411174c6e2b422461f0658d8c920b3e1ddb2eaaefe5eb02e7333f4302919d36d5baa2bd5a39fe05f19fc1e8cb0cf4eac"

RPROVIDES:${PN} += "libdnssec.so.9 \
libdnssec9"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgnutls.so.30"

inherit rpm

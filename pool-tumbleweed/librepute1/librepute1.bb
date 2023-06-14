SUMMARY = "Library for performing REPUTE queries for spammy domains"
DESCRIPTION = "This package provides the shared library librepute which \
performs REPUTE queries for spammy domains."
LICENSE = "BSD-3-Clause"

PV = "2.11.0"

RPM_NAME = "librepute1-2.11.0-7.15.aarch64.rpm"
RPM_HASH = "0a985ef38d5b9f867c78275da39b1889e1d55750b85ba8e44fd550efe73584bc77c887cc371230b7bff27a3a6f022f5bebe7789c12165a8ed448e048aebedd76"

RPROVIDES:${PN} += "librepute.so.1 \
librepute1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl.so.4 \
libjansson.so.4 \
libut.so.1"

inherit rpm

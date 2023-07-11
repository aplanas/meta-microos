SUMMARY = "Library for performing REPUTE queries for spammy domains"
DESCRIPTION = "This package provides the shared library librepute which \
performs REPUTE queries for spammy domains."
LICENSE = "BSD-3-Clause"

PV = "2.11.0"

RPM_NAME = "librepute1-2.11.0-7.16.aarch64.rpm"
RPM_HASH = "550c6cdb5b2596ff1769fe529de561cb4438cc6c3817c9b18e10a6208db63547a4587432796533c9af0a5ade36c4cfb2e60d351277c24e76721d200428bd9c7c"

RPROVIDES:${PN} += "librepute.so.1 \
librepute1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl.so.4 \
libjansson.so.4 \
libut.so.1"

inherit rpm

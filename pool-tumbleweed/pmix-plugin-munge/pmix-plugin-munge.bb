SUMMARY = "PMI-X munge plugin version 1"
DESCRIPTION = "This package contains the munge plugin for libpmix2."
LICENSE = "BSD-3-Clause"

PV = "3.2.3"

RPM_NAME = "pmix-plugin-munge-3.2.3-10.1.aarch64.rpm"
RPM_HASH = "0af2ff414e73e85b33d45dee3735822649a0d880cba098d30e5801840d59656d23bd0d3bf2554082670661cd829464a6f7068033e59b0e4fa0b3a4b85ce45719"

RPROVIDES:${PN} += "pmix-plugin-munge"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libmca-common-dstore1 \
libmunge.so.2 \
libpmix.so.2"

inherit rpm

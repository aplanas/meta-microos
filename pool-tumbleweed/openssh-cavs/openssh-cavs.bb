SUMMARY = "OpenSSH FIPS crypto module CAVS tests"
DESCRIPTION = "This package contains the FIPS-140 CAVS (Cryptographic Algorithm \
Validation Program/Suite) related tests of OpenSSH."
LICENSE = "BSD-2-Clause & MIT"

PV = "8.9p1"

RPM_NAME = "openssh-cavs-8.9p1-9.2.aarch64.rpm"
RPM_HASH = "84d61e88a7f007f0f1eb75f8526f481dd59fca0c275a20a96d0865ed19551bfd383da48298bf7f263b97452d5daa5bd73f7a193ad23ef0f95a932b69e4fb6cb2"

RPROVIDES:${PN} += "openssh-cavs"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libfido2.so.1 \
libz.so.1 \
openssh-common"

inherit rpm

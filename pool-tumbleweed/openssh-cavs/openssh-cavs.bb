SUMMARY = "OpenSSH FIPS crypto module CAVS tests"
DESCRIPTION = "This package contains the FIPS-140 CAVS (Cryptographic Algorithm \
Validation Program/Suite) related tests of OpenSSH."
LICENSE = "BSD-2-Clause & MIT"

PV = "9.3p2"

RPM_NAME = "openssh-cavs-9.3p2-1.1.aarch64.rpm"
RPM_HASH = "405d8e115360e05131d24ae3b107f80a544cff69ea78588db656a195cacf1cad4880180785a8beaa3d2f7d531d0b046003d8ee8f5920f1ef3b15b1ac4ee9ebfd"

RPROVIDES:${PN} += "openssh-cavs"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libfido2.so.1 \
libz.so.1 \
openssh-common"

inherit rpm

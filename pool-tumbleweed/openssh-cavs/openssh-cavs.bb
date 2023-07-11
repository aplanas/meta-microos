SUMMARY = "OpenSSH FIPS crypto module CAVS tests"
DESCRIPTION = "This package contains the FIPS-140 CAVS (Cryptographic Algorithm \
Validation Program/Suite) related tests of OpenSSH."
LICENSE = "BSD-2-Clause & MIT"

PV = "9.3p1"

RPM_NAME = "openssh-cavs-9.3p1-1.2.aarch64.rpm"
RPM_HASH = "13f1fb4b869e1adec4a3604cbdde9a25cac197c393b49d8beef2436c100a30230e2d27937b16af4426774d903da8a5e5091bb9728e2971ea121862c89e98e296"

RPROVIDES:${PN} += "openssh-cavs"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libfido2.so.1 \
libz.so.1 \
openssh-common"

inherit rpm

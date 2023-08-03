SUMMARY = "The GNU Compiler Collection targeting rx"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting rx."
LICENSE = "GPL-3.0-or-later"

PV = "13.1.1+git7597"

RPM_NAME = "cross-rx-gcc13-13.1.1+git7597-1.1.aarch64.rpm"
RPM_HASH = "79edf1c99f1d2593da3c22be81e137fa62d4f486d46ac4154a96f5738c49121cbd39a8ae37e8fbc1455ebbf547d73ae8b2fb1d927955ba85c245d8830df61354"

RPROVIDES:${PN} += "cross-rx-gcc13 \
rx-elf-gcc"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-rx-binutils \
libstdc++6-devel-gcc13 \
update-alternatives"

inherit rpm

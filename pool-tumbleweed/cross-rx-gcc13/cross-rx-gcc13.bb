SUMMARY = "The GNU Compiler Collection targeting rx"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting rx."
LICENSE = "GPL-3.0-or-later"

PV = "13.2.1+git7683"

RPM_NAME = "cross-rx-gcc13-13.2.1+git7683-1.1.aarch64.rpm"
RPM_HASH = "fca2008223ae5ebce169e51015d16ab19c3729a0bef9f5cb2540d1f96e2d50e1625f0c3401e132b015583c10ea484cbb16f84c6805c6bc105f1438fabfa084f8"

RPROVIDES:${PN} += "cross-rx-gcc13 \
rx-elf-gcc"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-rx-binutils \
libstdc++6-devel-gcc13 \
update-alternatives"

inherit rpm

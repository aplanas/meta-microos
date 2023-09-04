SUMMARY = "The GNU Compiler Collection targeting sparcv9"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting sparcv9. \
 \
Note this is only useful for building freestanding things like the \
kernel since it fails to include target libraries and headers."
LICENSE = "GPL-3.0-or-later"

PV = "13.2.1+git7683"

RPM_NAME = "cross-sparc-gcc13-13.2.1+git7683-1.1.aarch64.rpm"
RPM_HASH = "f1f7ea4caa4c111166c750a21ad3359c2baa38bc1a04e97f207fedb5380b9a09bdfa72adbb3e40b5550a46f0a94ad7dac7bac23211c425403755b86ba146f2f7"

RPROVIDES:${PN} += "cross-sparc-gcc13"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-sparc-binutils \
libstdc++6-devel-gcc13 \
update-alternatives"

inherit rpm

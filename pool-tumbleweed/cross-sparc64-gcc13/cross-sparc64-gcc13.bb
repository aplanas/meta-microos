SUMMARY = "The GNU Compiler Collection targeting sparc64"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting sparc64. \
 \
Note this is only useful for building freestanding things like the \
kernel since it fails to include target libraries and headers."
LICENSE = "GPL-3.0-or-later"

PV = "13.1.1+git7364"

RPM_NAME = "cross-sparc64-gcc13-13.1.1+git7364-1.2.aarch64.rpm"
RPM_HASH = "8474e5337c07386401231ed656dfbabba463905cf75e05424596b945e9e906903405f2a8ceaad1d67fccad77d14a6b8cc8b008a431afc46bebbbf1f16b3e830b"

RPROVIDES:${PN} += "cross-sparc64-gcc13"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-sparc64-binutils \
libstdc++6-devel-gcc13 \
update-alternatives"

inherit rpm

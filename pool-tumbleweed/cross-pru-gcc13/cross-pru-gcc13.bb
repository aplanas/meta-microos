SUMMARY = "The GNU Compiler Collection targeting pru"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting pru."
LICENSE = "GPL-3.0-or-later"

PV = "13.1.1+git7364"

RPM_NAME = "cross-pru-gcc13-13.1.1+git7364-1.1.aarch64.rpm"
RPM_HASH = "990ef990202198f529567bf6b0c521e3bc389ae0a6949d5eb16eeef0c1af8cae94835c0d8be590dc2796b46bc4917e33c5df6479c861540c383173bf570a9d76"

RPROVIDES:${PN} += "cross-pru-gcc13 \
cross-pru-gcc13(aarch-64) \
pru-gcc"

RDEPENDS:${PN} += "/bin/sh \
cross-pru-binutils \
libstdc++6-devel-gcc13 \
update-alternatives"

inherit rpm

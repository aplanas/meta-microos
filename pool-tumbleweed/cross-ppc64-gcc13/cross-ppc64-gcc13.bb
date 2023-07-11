SUMMARY = "The GNU Compiler Collection targeting ppc64"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting ppc64. \
 \
Note this is only useful for building freestanding things like the \
kernel since it fails to include target libraries and headers."
LICENSE = "GPL-3.0-or-later"

PV = "13.1.1+git7364"

RPM_NAME = "cross-ppc64-gcc13-13.1.1+git7364-1.2.aarch64.rpm"
RPM_HASH = "171cc75f2201e3449260960c30dd325ba27748c2bc53c9a51f6b94aaa6510d1364bdd8353c4b5a2517c98e720bb633d7aa3fc326ad14a8b2e34a84b35b613638"

RPROVIDES:${PN} += "cross-ppc64-gcc13"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-ppc64-binutils \
libstdc++6-devel-gcc13 \
update-alternatives"

inherit rpm

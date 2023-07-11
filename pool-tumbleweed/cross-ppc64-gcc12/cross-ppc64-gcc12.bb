SUMMARY = "The GNU Compiler Collection targeting ppc64"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting ppc64. \
 \
Note this is only useful for building freestanding things like the \
kernel since it fails to include target libraries and headers."
LICENSE = "GPL-3.0-or-later"

PV = "12.3.0+git1204"

RPM_NAME = "cross-ppc64-gcc12-12.3.0+git1204-1.2.aarch64.rpm"
RPM_HASH = "37105fd0eeea3c1f923475f0ba76e5c4c0e2e5b2cc49d9bf500d7a6b335f582a723c2c332c88a9566e5afabae632cdba9bf605a1b721912017292d9b2697840c"

RPROVIDES:${PN} += "cross-ppc64-gcc12"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-ppc64-binutils \
libstdc++6-devel-gcc12 \
update-alternatives"

inherit rpm

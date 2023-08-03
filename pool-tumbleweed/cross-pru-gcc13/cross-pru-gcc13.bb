SUMMARY = "The GNU Compiler Collection targeting pru"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting pru."
LICENSE = "GPL-3.0-or-later"

PV = "13.1.1+git7597"

RPM_NAME = "cross-pru-gcc13-13.1.1+git7597-1.1.aarch64.rpm"
RPM_HASH = "65c22059aeddb5433b8c66f6d3c4b8c748d8aeb3eecdccc28ebdaf176ab9ee8a61ca16572da09936780e447900da29652f40912bbefbc26c351de21b500d40ce"

RPROVIDES:${PN} += "cross-pru-gcc13 \
pru-gcc"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-pru-binutils \
libstdc++6-devel-gcc13 \
update-alternatives"

inherit rpm

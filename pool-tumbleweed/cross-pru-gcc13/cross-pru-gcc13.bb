SUMMARY = "The GNU Compiler Collection targeting pru"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting pru."
LICENSE = "GPL-3.0-or-later"

PV = "13.2.1+git7683"

RPM_NAME = "cross-pru-gcc13-13.2.1+git7683-1.1.aarch64.rpm"
RPM_HASH = "e984923a5e2cc0908e52565a3eff08a8ea46432533cf6c0f0519824d5bb31121478ee8225c9d25c85f0250f70d843c1984bdbdfdd5be0db118c00cc0fa890ac8"

RPROVIDES:${PN} += "cross-pru-gcc13 \
pru-gcc"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-pru-binutils \
libstdc++6-devel-gcc13 \
update-alternatives"

inherit rpm

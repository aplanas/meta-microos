SUMMARY = "The GNU Compiler Collection targeting avr"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting avr."
LICENSE = "GPL-3.0-or-later"

PV = "13.1.1+git7597"

RPM_NAME = "cross-avr-gcc13-13.1.1+git7597-1.1.aarch64.rpm"
RPM_HASH = "c40e2e8d37e39c8025774dd45b09248872bab79b510ede2ce4dfc27e99994ea57d3874e008eaa276635e2e0bf90a4518e7e1f8e92877aa59aaab8bff5d84c2bb"

RPROVIDES:${PN} += "cross-avr-gcc13"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-avr-binutils \
libstdc++6-devel-gcc13 \
update-alternatives"

inherit rpm

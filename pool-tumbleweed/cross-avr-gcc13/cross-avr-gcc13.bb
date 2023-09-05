SUMMARY = "The GNU Compiler Collection targeting avr"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting avr."
LICENSE = "GPL-3.0-or-later"

PV = "13.2.1+git7683"

RPM_NAME = "cross-avr-gcc13-13.2.1+git7683-2.1.aarch64.rpm"
RPM_HASH = "93f814df8ddccfc8622b271cf19e8db952c4b16fbf94bf0495389e1819e71d2f180c54d10288b253910341d74c175c3b0b75cec50e45011bd605285d5f2cde5f"

RPROVIDES:${PN} += "cross-avr-gcc13"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-avr-binutils \
libstdc++6-devel-gcc13 \
update-alternatives"

inherit rpm

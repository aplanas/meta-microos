SUMMARY = "The GNU Compiler Collection targeting avr"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting avr."
LICENSE = "GPL-3.0-or-later"

PV = "13.1.1+git7364"

RPM_NAME = "cross-avr-gcc13-13.1.1+git7364-1.2.aarch64.rpm"
RPM_HASH = "162a6b687406520f1187cdc02dd95759808f04c1aca9d290248f8615d7067830346976ec46b279a83acb0256d018151db4864f82c2d806798578efa9050da0f1"

RPROVIDES:${PN} += "cross-avr-gcc13"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-avr-binutils \
libstdc++6-devel-gcc13 \
update-alternatives"

inherit rpm

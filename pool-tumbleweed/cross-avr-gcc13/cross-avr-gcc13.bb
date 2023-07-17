SUMMARY = "The GNU Compiler Collection targeting avr"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting avr."
LICENSE = "GPL-3.0-or-later"

PV = "13.1.1+git7552"

RPM_NAME = "cross-avr-gcc13-13.1.1+git7552-1.1.aarch64.rpm"
RPM_HASH = "afbb6947da2101efc3cb49cda2f3065db9b6f04f1e4d6fc1de1a8c41cffb72b8d61849262084ffdf47871237f27506f1df1df767498e83fabf9a82b44be4e8b1"

RPROVIDES:${PN} += "cross-avr-gcc13"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-avr-binutils \
libstdc++6-devel-gcc13 \
update-alternatives"

inherit rpm

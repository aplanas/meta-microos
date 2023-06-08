SUMMARY = "The GNU Compiler Collection targeting avr"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting avr."
LICENSE = "GPL-3.0-or-later"

PV = "11.3.1+git2076"

RPM_NAME = "cross-avr-gcc11-11.3.1+git2076-2.3.aarch64.rpm"
RPM_HASH = "9de235ef0fe30844fa07c544de98a1ee03f8fe6feefdc52e8a8c277d3513250364b2d3c97e732ddb469ff2899ca028cb43ef1b80049562452a07cb3f4060d71d"

RPROVIDES:${PN} += "cross-avr-gcc11 cross-avr-gcc11(aarch-64)"
RDEPENDS:${PN} += "/bin/sh cross-avr-binutils libstdc++6-devel-gcc11 update-alternatives"

inherit rpm

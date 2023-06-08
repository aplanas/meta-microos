SUMMARY = "The GNU Compiler Collection targeting avr"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting avr."
LICENSE = "GPL-3.0-or-later"

PV = "13.0.1+git7231"

RPM_NAME = "cross-avr-gcc13-13.0.1+git7231-1.1.aarch64.rpm"
RPM_HASH = "47661e49d59967595388a342f3b578398cbc4ea1cc6d17e8fa3a60b4c55e21d8777fbc8b5023c3fbd041f8482af99655ff7cb0623b6d9bb176c7e3c9a78ab5de"

RPROVIDES:${PN} += "cross-avr-gcc13 cross-avr-gcc13(aarch-64)"
RDEPENDS:${PN} += "/bin/sh cross-avr-binutils libstdc++6-devel-gcc13 update-alternatives"

inherit rpm

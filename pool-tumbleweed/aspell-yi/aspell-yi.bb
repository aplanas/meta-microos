SUMMARY = "Yiddish (ייִדיש) Dictionary for Aspell"
DESCRIPTION = "A Yiddish (ייִדיש) dictionary for the aspell spell checker."
LICENSE = "GPL-2.0-or-later"

PV = "0.01.1"

RPM_NAME = "aspell-yi-0.01.1-2.14.aarch64.rpm"
RPM_HASH = "00dd2e4dccae2ae5f2a52d6e0d005809fb4633252d2b576598c802392384a2c52feeb8c6d3108ceff0c744e03dfb2f3ac35e08a01faed32b2f75d6ede6da3894"

RPROVIDES:${PN} += "aspell-yi \
aspell-yi(aarch-64) \
locale(aspell:yi)"

RDEPENDS:${PN} += ""

inherit rpm

SUMMARY = "Bengali (বাংলা) Dictionary for Aspell"
DESCRIPTION = "A Bengali (বাংলা) dictionary for the aspell spell checker."
LICENSE = "GPL-2.0-or-later"

PV = "0.01.1"

RPM_NAME = "aspell-bn-0.01.1-2.14.aarch64.rpm"
RPM_HASH = "b252917ef2217f092cedb804225a5bea74b1cd8d4868720c91838a7dbe4d2bb110483990724ca565bd30dac10e665f5eccbcef711cd7cd9c3ae76597c5d2a5b7"

RPROVIDES:${PN} += "aspell-bn aspell-bn(aarch-64) locale(aspell:bn)"
RDEPENDS:${PN} += ""

inherit rpm

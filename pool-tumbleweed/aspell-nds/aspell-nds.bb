SUMMARY = "Low Saxon (Plattdüütsch) Dictionary for Aspell"
DESCRIPTION = "A Low Saxon (Plattdüütsch) dictionary for the aspell spell checker."
LICENSE = "LGPL-2.1-or-later"

PV = "0.01"

RPM_NAME = "aspell-nds-0.01-2.14.aarch64.rpm"
RPM_HASH = "f737b6041760042022c062961f0e89f65c9957c06ad2d28bbcc200e691499a30a3a1950cbc9f81adca88046a806a1d15e0eef9647e4170ff47303cc82279f121"

RPROVIDES:${PN} += "aspell-nds \
aspell-nds(aarch-64) \
locale(aspell:nds)"

RDEPENDS:${PN} += ""

inherit rpm

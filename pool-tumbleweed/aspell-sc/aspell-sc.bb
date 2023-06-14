SUMMARY = "Sardinian (Sardu) Dictionary for Aspell"
DESCRIPTION = "A Sardinian (Sardu) dictionary for the aspell spell checker."
LICENSE = "GPL-2.0-or-later"

PV = "1.0"

RPM_NAME = "aspell-sc-1.0-2.14.aarch64.rpm"
RPM_HASH = "5073b62b909cbe6e21fd30ab0fd38f55b41431765ea8adc9f7f3a340f9f863c04b1e51143e140491c29d877b9c1e07b84ca83cd4e5e5688d86f1bdf3a1948b51"

RPROVIDES:${PN} += "aspell-sc \
locale-aspell-sc"

RDEPENDS:${PN} += ""

inherit rpm

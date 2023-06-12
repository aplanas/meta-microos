SUMMARY = "Oriya (ଓଡ଼ିଆ) Dictionary for Aspell"
DESCRIPTION = "An Oriya (ଓଡ଼ିଆ) dictionary for the aspell spell checker."
LICENSE = "GPL-2.0-or-later"

PV = "0.03"

RPM_NAME = "aspell-or-0.03-2.14.aarch64.rpm"
RPM_HASH = "df87f0bee5b5a3c13e3eef967ee041795eeb332eb0e40ed01b8f852ec170c8207f6dbc03c10a7caeb1a22da78ecf28fe086c99588976ecb2b510990a76561394"

RPROVIDES:${PN} += "aspell-or \
aspell-or(aarch-64) \
locale(aspell:or)"
RDEPENDS:${PN} += ""

inherit rpm

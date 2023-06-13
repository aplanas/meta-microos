SUMMARY = "Documentation for Scribus"
DESCRIPTION = "This package provides the documentation for Scribus."
LICENSE = "GPL-2.0-or-later"

PV = "1.5.8"

RPM_NAME = "scribus-doc-1.5.8-4.12.aarch64.rpm"
RPM_HASH = "21ec90936b658050ff9c969ab040da96112b18b63d858273bacd53474b2dd0fa5da5736414b493e70255c03cd450b0354663b25f4511a65360eca1cf90c5e91e"

RPROVIDES:${PN} += "scribus-doc \
scribus-doc(aarch-64)"

RDEPENDS:${PN} += ""

inherit rpm

SUMMARY = "Macedonian (македонски) Dictionary for Aspell"
DESCRIPTION = "A Macedonian (македонски) dictionary for the aspell spell checker."
LICENSE = "GPL-2.0-or-later"

PV = "0.50"

RPM_NAME = "aspell-mk-0.50-2.14.aarch64.rpm"
RPM_HASH = "6b7e0db773682eae33bcdf5f3235f9c04422ecf0102487472c72a20a1e3ec37166227b8f532d3cef0f22c81b6a06010f133c9803cd051fabf742942a86db9687"

RPROVIDES:${PN} += "aspell-mk \
aspell-mk(aarch-64) \
locale(aspell:mk)"

RDEPENDS:${PN} += ""

inherit rpm

SUMMARY = "Slovenian (slovenski) Dictionary for Aspell"
DESCRIPTION = "A Slovenian (slovenski) dictionary for the aspell spell checker."
LICENSE = "GPL-2.0-or-later"

PV = "0.50"

RPM_NAME = "aspell-sl-0.50-2.14.aarch64.rpm"
RPM_HASH = "628763a3eac5e4a1674db36d30b14ddaac5ad972ba35358950af7676baf70fecfed71599da404579974aac36e3f8800fb5a257a14f057772497b72bd9a54d393"

RPROVIDES:${PN} += "aspell-sl \
aspell-sl(aarch-64) \
locale(aspell:sl)"

RDEPENDS:${PN} += ""

inherit rpm

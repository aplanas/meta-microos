SUMMARY = "Technical Writing"
DESCRIPTION = "Authoring tools and editors for creating technical documentation."
LICENSE = "MIT"

PV = "20201106"

RPM_NAME = "patterns-desktop-technical_writing-20201106-3.5.aarch64.rpm"
RPM_HASH = "d3c47ac49d97d8fd8f6c1e1cb32ae1c28e787f349e93dfbf58bf1a94ac623c0fb15bdeffc26a253874c04f9783210724f303f4a80bdcb57d5731a0896e1fa308"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
pattern-visible- \
patterns-desktop-technical-writing \
patterns-openSUSE-technical-writing"

RDEPENDS:${PN} += ""

inherit rpm

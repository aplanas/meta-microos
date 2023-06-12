SUMMARY = "Fish Completion for typst"
DESCRIPTION = "Fish command-line completion support for typst."
LICENSE = "Apache-2.0"

PV = "0.3.0"

RPM_NAME = "typst-fish-completion-0.3.0-1.1.noarch.rpm"
RPM_HASH = "99ab578940b13cc440fd979786230c790c9becfe0387f54d93c01a8309c00d6864b854ae213d8eb51f295bf3212374fd85012a6abf362a26e1ed52eb94092295"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "typst-fish-completion"
RDEPENDS:${PN} += ""

inherit rpm

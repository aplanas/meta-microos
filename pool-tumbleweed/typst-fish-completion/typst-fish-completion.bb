SUMMARY = "Fish Completion for typst"
DESCRIPTION = "Fish command-line completion support for typst."
LICENSE = "Apache-2.0"

PV = "0.5.0"

RPM_NAME = "typst-fish-completion-0.5.0-1.1.noarch.rpm"
RPM_HASH = "890cec02979b984d1517a1e3479912060b58506c87deec27be6c321fc12126e746dfcb1345669c858bf10d784cf579e0e26991225e0ad2de1cc4c463d17e62f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "typst-fish-completion"

RDEPENDS:${PN} += ""

inherit rpm

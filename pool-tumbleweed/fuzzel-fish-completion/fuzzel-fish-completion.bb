SUMMARY = "Fish Completion for fuzzel"
DESCRIPTION = "Fish command-line completion support for fuzzel."
LICENSE = "MIT"

PV = "1.9.2"

RPM_NAME = "fuzzel-fish-completion-1.9.2-1.1.noarch.rpm"
RPM_HASH = "38035b30e98b21706614627ca0cf95df60bf7840766f43ac38391778f7caaea301f5810514aa1bc4f483d5329157940ac09117fbaa94cad90c02193166398afc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fuzzel-fish-completion"

RDEPENDS:${PN} += "fish"

inherit rpm

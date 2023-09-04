SUMMARY = "Bash Completion for typst"
DESCRIPTION = "Bash command-line completion support for typst."
LICENSE = "Apache-2.0"

PV = "0.7.0"

RPM_NAME = "typst-bash-completion-0.7.0-1.1.noarch.rpm"
RPM_HASH = "dd9b77b3d6f610a2852f15378b54775c255225c4771fc12979d53015c15fd4f723fff5346e0f4e08a414ea014a2a3940df7922c61d75ba968f43888a753f44ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "typst-bash-completion"

RDEPENDS:${PN} += ""

inherit rpm

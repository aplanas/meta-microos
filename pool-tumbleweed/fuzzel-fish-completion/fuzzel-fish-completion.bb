SUMMARY = "Fish Completion for fuzzel"
DESCRIPTION = "Fish command-line completion support for fuzzel."
LICENSE = "MIT"

PV = "1.9.1"

RPM_NAME = "fuzzel-fish-completion-1.9.1-2.2.noarch.rpm"
RPM_HASH = "a0f3f66e014196d3a06d15a835d1f7eeae190be6ac1dbb9cbf4f8b76f4bfedd356208bcf89fd12d7922fac2005115c838fabdf5e1473534fb4f48aaa5f5cfdbe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fuzzel-fish-completion"

RDEPENDS:${PN} += "fish"

inherit rpm

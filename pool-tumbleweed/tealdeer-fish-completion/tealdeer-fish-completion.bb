SUMMARY = "Fish Completion for tealdeer"
DESCRIPTION = "Fish command-line completion support for tealdeer."
LICENSE = "Apache-2.0 | MIT"

PV = "1.6.1"

RPM_NAME = "tealdeer-fish-completion-1.6.1-2.1.noarch.rpm"
RPM_HASH = "b2a973ae80137d308a77c8801c770f50bc016098f6c8be41d2f9936fb3c4a8b5ef9343f3f6e777264617fe38a56849d3e87f2b1c087222b637d822b8dca7bd91"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tealdeer-fish-completion"

RDEPENDS:${PN} += "fish"

inherit rpm

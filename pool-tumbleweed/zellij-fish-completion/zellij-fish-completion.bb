SUMMARY = "Fish Completion for zellij"
DESCRIPTION = "Fish command-line completion support for zellij."
LICENSE = "MIT"

PV = "0.37.2"

RPM_NAME = "zellij-fish-completion-0.37.2-2.1.noarch.rpm"
RPM_HASH = "14f33f3d4928a461558ebf2cedb043c4fa7b6e7228f342cc90bfda01d922660688ef232f6896176948505d7c4b1f2e7cea9b711be77fe36327fcc7bf067c363a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "zellij-fish-completion"

RDEPENDS:${PN} += "fish"

inherit rpm

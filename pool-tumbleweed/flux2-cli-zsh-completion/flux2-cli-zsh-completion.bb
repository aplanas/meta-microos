SUMMARY = "Zsh Completion for flux2-cli"
DESCRIPTION = "zsh command line completion support for flux2-cli."
LICENSE = "Apache-2.0"

PV = "2.0.0~rc4"

RPM_NAME = "flux2-cli-zsh-completion-2.0.0~rc4-1.1.noarch.rpm"
RPM_HASH = "30b6df1a5eab50b903fc957147f34a7ce83f498327cf624a1dc2ec1dc2c0cffb1444e8e5e786641a4969a5531b94c90867f5f933efe8931061a4619203034b59"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "flux2-cli-zsh-completion"

RDEPENDS:${PN} += "flux2-cli"

inherit rpm

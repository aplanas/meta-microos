SUMMARY = "Zsh Completion for exa"
DESCRIPTION = "Zsh command line completion support for exa."
LICENSE = "MIT"

PV = "0.10.1"

RPM_NAME = "exa-zsh-completion-0.10.1-3.6.noarch.rpm"
RPM_HASH = "ba39a66b3883b7c47a64002a6fa3d3017f69b38711761f47becabef2adc110f47212582a1b9a77e23b424949aac10c4691262e177371eaa6f179407fe9ec3ef8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "exa-zsh-completion"

RDEPENDS:${PN} += "exa"

inherit rpm

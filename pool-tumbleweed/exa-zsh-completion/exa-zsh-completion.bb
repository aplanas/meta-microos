SUMMARY = "Zsh Completion for exa"
DESCRIPTION = "Zsh command line completion support for exa."
LICENSE = "MIT"

PV = "0.10.1"

RPM_NAME = "exa-zsh-completion-0.10.1-3.5.noarch.rpm"
RPM_HASH = "9da289db91b5a8fdef0de0c2c80e338c4d8ae353583fc979ef2e85e535868d27db038b55adcf1c161ece1ac150f85594c22e4c8b1b18db3de4781b4671719e29"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "exa-zsh-completion"

RDEPENDS:${PN} += "exa"

inherit rpm

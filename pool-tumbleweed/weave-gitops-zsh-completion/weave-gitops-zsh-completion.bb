SUMMARY = "Zsh Completion for weave-gitops"
DESCRIPTION = "zsh command line completion support for weave-gitops."
LICENSE = "MPL-2.0"

PV = "0.31.2"

RPM_NAME = "weave-gitops-zsh-completion-0.31.2-1.1.noarch.rpm"
RPM_HASH = "9a34ef98eb7f3fc01c4e843c71cbad052e61281284831b580b7719975678e49f61bbe10ac2a0b940bc64e46fcd0670c9d5ae772b571c269f02402db7597d25e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "weave-gitops-zsh-completion"

RDEPENDS:${PN} += "weave-gitops"

inherit rpm

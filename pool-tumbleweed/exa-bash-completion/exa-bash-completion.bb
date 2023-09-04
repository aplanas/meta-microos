SUMMARY = "Bash Completion for exa"
DESCRIPTION = "Bash command line completion support for exa."
LICENSE = "MIT"

PV = "0.10.1"

RPM_NAME = "exa-bash-completion-0.10.1-3.6.noarch.rpm"
RPM_HASH = "c95568fa1f4121716b9495b8f99dc9f2032f0018c920ae3fd5d2a541ae300756050efeaf67cc7524888a7a410dc6628345728dc81ca74ac224c6da72d36317ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "exa-bash-completion"

RDEPENDS:${PN} += "exa"

inherit rpm

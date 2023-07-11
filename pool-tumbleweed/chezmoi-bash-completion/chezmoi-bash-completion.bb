SUMMARY = "Bash completion for chezmoi"
DESCRIPTION = "Bash command line completion support for chezmoi."
LICENSE = "MIT"

PV = "2.34.3"

RPM_NAME = "chezmoi-bash-completion-2.34.3-1.1.noarch.rpm"
RPM_HASH = "9ef30b185ede0359bb8fd52095539ed328ed3b1518648bcfd2791a7a9a6b276ac306228fc4c51dd6a712226c25de291a02c7bb7ef84fbf5851fcf6a396913c0c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "chezmoi-bash-completion"

RDEPENDS:${PN} += "chezmoi"

inherit rpm

SUMMARY = "Bash completion for fzf"
DESCRIPTION = "Bash shell completions for fzf"
LICENSE = "MIT"

PV = "0.42.0"

RPM_NAME = "fzf-bash-completion-0.42.0-1.1.noarch.rpm"
RPM_HASH = "0e075b05db1751be5c504a24b6ded05b83bb7f20413eaf0502259280d85926cc1d46c61243c85d1f235ca3db7acbc6d092853e9060b65c4a3593dc673b977164"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fzf-bash-completion"

RDEPENDS:${PN} += "bash-completion \
fzf"

inherit rpm

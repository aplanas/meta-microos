SUMMARY = "Bash completion for fzf"
DESCRIPTION = "Bash shell completions for fzf"
LICENSE = "MIT"

PV = "0.42.0"

RPM_NAME = "fzf-bash-completion-0.42.0-1.2.noarch.rpm"
RPM_HASH = "fabf614d6c4d0f501a8452f8ed531b5dee9ff87dcdbb48edca56a7aed8d3de98c05fb56dce6c66200b6745c8dfe9643114ea60ffa9ac741f0c74164c01e18896"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fzf-bash-completion"

RDEPENDS:${PN} += "bash-completion \
fzf"

inherit rpm

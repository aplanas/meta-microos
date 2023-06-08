SUMMARY = "ZSH completion for fzf"
DESCRIPTION = "zsh shell completions for fzf"
LICENSE = "MIT"

PV = "0.40.0"

RPM_NAME = "fzf-zsh-completion-0.40.0-1.1.noarch.rpm"
RPM_HASH = "bbe4dd5ad6966e316025eac7bb7d8f304558c9f48f6a05d3575573077f0623fda1f69624cff7d3e7ef301be7cedbaf542d1d911b45eae256ae52f1a2b7ec5957"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(fzf-zsh-completion) fzf-zsh-completion"
RDEPENDS:${PN} += "fzf zsh"

inherit rpm

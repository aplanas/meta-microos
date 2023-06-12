SUMMARY = "Bash completion for fzf"
DESCRIPTION = "Bash shell completions for fzf"
LICENSE = "MIT"

PV = "0.41.0"

RPM_NAME = "fzf-bash-completion-0.41.0-1.1.noarch.rpm"
RPM_HASH = "989196a9f4d75468ead9c87e07b2faecebbcf9daf4f368e08e7aa0c59041b8e62dfa54509ed1af7b9ae99c9f9dc386d8158806400f2b2ad10667eea034044c3d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fzf-bash-completion"
RDEPENDS:${PN} += "bash-completion \
fzf"

inherit rpm

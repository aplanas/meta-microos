SUMMARY = "Tmux integration for fzf"
DESCRIPTION = "Tmux integration for fzf. Includes a wrapper script, fzf-tmux, that opens your list in a \
separate tmux pane."
LICENSE = "MIT"

PV = "0.40.0"

RPM_NAME = "fzf-tmux-0.40.0-1.1.noarch.rpm"
RPM_HASH = "860bcd4683b346d1a33808fd66dd3f4c1a2752401358c182c5adda7cc34c52d0bd5b67cb2d9576aa511208124ea5eb892fdaa975db9d0df0e39b121bfffeb793"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fzf-tmux"
RDEPENDS:${PN} += "/bin/bash"

inherit rpm

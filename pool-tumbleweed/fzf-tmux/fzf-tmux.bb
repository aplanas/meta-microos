SUMMARY = "Tmux integration for fzf"
DESCRIPTION = "Tmux integration for fzf. Includes a wrapper script, fzf-tmux, that opens your list in a \
separate tmux pane."
LICENSE = "MIT"

PV = "0.41.0"

RPM_NAME = "fzf-tmux-0.41.0-1.1.noarch.rpm"
RPM_HASH = "a8a5a605bc245fc4cb80bd9db6f60d9f9e3775656651e1722781654800c586c8ae3144862e4be16c95b871eb134ad2335231af7ea03e382e0f2e2ac9062f374f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fzf-tmux"

RDEPENDS:${PN} += "/usr/bin/bash"

inherit rpm

SUMMARY = "Tmux integration for fzf"
DESCRIPTION = "Tmux integration for fzf. Includes a wrapper script, fzf-tmux, that opens your list in a \
separate tmux pane."
LICENSE = "MIT"

PV = "0.42.0"

RPM_NAME = "fzf-tmux-0.42.0-1.1.noarch.rpm"
RPM_HASH = "6be23436607f9906cf6c1ef2ad76b79f78f94123b9e7a39064e755f981b677f18b04aa8990a05a7032d2d0b9a5212b40ca78c0d95a2436e4c780b34ed39c2e2c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fzf-tmux"

RDEPENDS:${PN} += "/usr/bin/bash"

inherit rpm

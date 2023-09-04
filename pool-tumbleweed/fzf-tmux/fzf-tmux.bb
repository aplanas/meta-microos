SUMMARY = "Tmux integration for fzf"
DESCRIPTION = "Tmux integration for fzf. Includes a wrapper script, fzf-tmux, that opens your list in a \
separate tmux pane."
LICENSE = "MIT"

PV = "0.42.0"

RPM_NAME = "fzf-tmux-0.42.0-1.2.noarch.rpm"
RPM_HASH = "a1f36806880b49be10b95917b458800728936558ae6bfd92319bd3c7938c2c5ce3775b7e3e6bf947d931e49361f3399a8a96533b58aa7736662d27076e3d42fb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fzf-tmux"

RDEPENDS:${PN} += "/usr/bin/bash"

inherit rpm

SUMMARY = "Powerline for tmux"
DESCRIPTION = "Powerline for tmux. \
 \
Add \
 \
    source /usr/share/tmux/powerline.conf \
 \
to your ~/.tmux.conf file."
LICENSE = "MIT"

PV = "2.8.3"

RPM_NAME = "tmux-powerline-2.8.3-3.1.noarch.rpm"
RPM_HASH = "0359a8a36313fc56c4f42d5ffe3b75ab03273a31a1376b0b164c4daa0f1b92226d541faebc6fe8eb1fefe57854720b5efe9279fb5ab73841e37efb43492ebb6b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tmux-powerline"

RDEPENDS:${PN} += "powerline \
tmux"

inherit rpm

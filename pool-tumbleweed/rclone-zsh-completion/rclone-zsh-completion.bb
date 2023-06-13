SUMMARY = "Zsh Completion for rclone"
DESCRIPTION = "Zsh command line completion support for rclone."
LICENSE = "MIT"

PV = "1.62.2"

RPM_NAME = "rclone-zsh-completion-1.62.2-2.2.noarch.rpm"
RPM_HASH = "a61c9f3ce722ded726fd5ad03ba78c429f6146847ed5b6fbdccce13f83f707023d77abd53d84db7824d3c3def959be81930240a026be20c973d3ea97c1143091"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rclone-zsh-completion"

RDEPENDS:${PN} += "rclone"

inherit rpm

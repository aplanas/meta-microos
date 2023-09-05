SUMMARY = "Grapical tool for common git operations"
DESCRIPTION = "A Tcl/Tk based graphical user interface to Git. git-gui focuses on \
allowing users to make changes to their repository by making new \
commits, amending existing ones, creating branches, performing local \
merges, and fetching/pushing to remote repositories. \
 \
Unlike gitk, git-gui focuses on commit generation and single file \
annotation, and does not show project history. It does however supply \
menu actions to start a gitk session from within git-gui."
LICENSE = "GPL-2.0-only"

PV = "2.42.0"

RPM_NAME = "git-gui-2.42.0-1.1.aarch64.rpm"
RPM_HASH = "ed797ce330af1dad0fe6ad90f7dfcd1bc03b23660da341e8242990d1f621bfa8232b47a25c7c2f421efbfe16859a7e274283bdf46f6076ccc740c4810c3f5145"

RPROVIDES:${PN} += "git-gui"

RDEPENDS:${PN} += "/usr/bin/sh \
git-core \
tk"

inherit rpm

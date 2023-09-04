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

PV = "2.41.0"

RPM_NAME = "git-gui-2.41.0-1.3.aarch64.rpm"
RPM_HASH = "6505d8e06c1a0ccbe404dffd9cd229cbb96dfba9e278676f9b717066f416b60b5eb4ce69d78ec38394fedb62e71edac91aa1126a828fe63ef597d212fd942a2b"

RPROVIDES:${PN} += "git-gui"

RDEPENDS:${PN} += "/usr/bin/sh \
git-core \
tk"

inherit rpm

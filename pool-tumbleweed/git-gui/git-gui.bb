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

PV = "2.40.1"

RPM_NAME = "git-gui-2.40.1-1.1.aarch64.rpm"
RPM_HASH = "0beacc326d40f2af5920e5f2edfbddc9f446b158ccdbaaac8d879c2d4f314359814d14ef0ea4ce700d91db376347321e165431ed4b9b7f58de616a04c74ff9ba"

RPROVIDES:${PN} += "application() \
application(git-gui.desktop) \
git-gui \
git-gui(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
git-core \
tk"

inherit rpm

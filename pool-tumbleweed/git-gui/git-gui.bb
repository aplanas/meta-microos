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

RPM_NAME = "git-gui-2.41.0-1.2.aarch64.rpm"
RPM_HASH = "78489c9e42b6dd44f08cb3ebeb906a5da79c6ad6e29677fbe444e880ad538e1b14c33028003d964692815a023de48b98b009bdf77a7958e95a23232f22f19743"

RPROVIDES:${PN} += "git-gui"

RDEPENDS:${PN} += "/usr/bin/sh \
git-core \
tk"

inherit rpm

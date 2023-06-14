SUMMARY = "Zsh Completion for restic"
DESCRIPTION = "Zsh command line completion support for restic."
LICENSE = "BSD-2-Clause"

PV = "0.15.2"

RPM_NAME = "restic-zsh-completion-0.15.2-1.2.noarch.rpm"
RPM_HASH = "dfbb6970af65d98133c04b91e62b1c0268315118182172539c599c6ead1e6b483d09454bd33b096d15b6a5b69250f94e1c1fcb0de92479ea4f63eaafc153422a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-restic-zsh-completion \
restic-zsh-completion"

RDEPENDS:${PN} += "restic"

inherit rpm

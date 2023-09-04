SUMMARY = "Zsh Completion for restic"
DESCRIPTION = "Zsh command line completion support for restic."
LICENSE = "BSD-2-Clause"

PV = "0.16.0"

RPM_NAME = "restic-zsh-completion-0.16.0-1.1.noarch.rpm"
RPM_HASH = "dec1a26f338a6c0404f26732df8134394da947f29bdcd04587a6f6a89cb3a404d5d8709ca618ca66a05053e1f0d59c85c19cc62e2e5a41bd98b391a843bca550"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-restic-zsh-completion \
restic-zsh-completion"

RDEPENDS:${PN} += "restic"

inherit rpm

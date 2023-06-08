SUMMARY = "ZSH Completion for feh"
DESCRIPTION = "ZSH completion script for feh 3."
LICENSE = "LGPL-2.0-or-later & MIT"

PV = "3.9.1"

RPM_NAME = "feh-zsh-completion-3.9.1-2.2.noarch.rpm"
RPM_HASH = "dab8a2bf2531082f88dd15acba8939211f412d9b7a6f084f11ee5c8f47f578abb556c30b67772e53855bb9a3be799248c7d1e6575ce0c3f92ebf5d7063e42a2c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "feh-zsh-completion"
RDEPENDS:${PN} += ""

inherit rpm

SUMMARY = "ZSH Completion for feh"
DESCRIPTION = "ZSH completion script for feh 3."
LICENSE = "LGPL-2.0-or-later & MIT"

PV = "3.9.1"

RPM_NAME = "feh-zsh-completion-3.9.1-2.3.noarch.rpm"
RPM_HASH = "3e45d95a8b8b1278b817e594113f09abd5845deb851bcac39a9ff3be6da0b449b4e33071f79d7701d7255c78ce1856ace7d6f18ee6340532e7545199205d4e68"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "feh-zsh-completion"

RDEPENDS:${PN} += ""

inherit rpm

SUMMARY = "ZSH Completion for libsixel"
DESCRIPTION = "ZSH command line completion support for libsixel."
LICENSE = "MIT"

PV = "1.10.3"

RPM_NAME = "libsixel-zsh-completion-1.10.3-1.7.noarch.rpm"
RPM_HASH = "3fa835e2eb709c52e318979b5ff408d39801ceb9c80e80e47a68db50981f45a913f664ad46c132e98b353e5872e9b2929fd2ec0bd1b097a154485df3f09ff237"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libsixel-zsh-completion"

RDEPENDS:${PN} += "libsixel-utils"

inherit rpm

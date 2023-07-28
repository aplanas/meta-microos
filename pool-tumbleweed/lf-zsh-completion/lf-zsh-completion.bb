SUMMARY = "Zsh Completion for lf"
DESCRIPTION = "Zsh command-line completion support for lf."
LICENSE = "MIT"

PV = "30"

RPM_NAME = "lf-zsh-completion-30-1.1.noarch.rpm"
RPM_HASH = "116ed1b04bfd3298a1c97a1d394139af9dcc600be45ef2501721bef6319bba877a08b7c4efbadfa93af9194aab0b22c23c0280f55541f9fc20523cd90518b76a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lf-zsh-completion"

RDEPENDS:${PN} += "zsh"

inherit rpm

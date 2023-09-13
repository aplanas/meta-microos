SUMMARY = "Bash completion for chezmoi"
DESCRIPTION = "Bash command line completion support for chezmoi."
LICENSE = "MIT"

PV = "2.39.1"

RPM_NAME = "chezmoi-bash-completion-2.39.1-1.1.noarch.rpm"
RPM_HASH = "4b7dd9bc4995b23297aea92f733d2cabb0233d842de27db6b1bc2014f57a66af82920e4e3f529088daa46b5a2b22b7447a136f05f767e34059834aad01859d24"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "chezmoi-bash-completion"

RDEPENDS:${PN} += "chezmoi"

inherit rpm

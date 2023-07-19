SUMMARY = "Zsh Completion for helm"
DESCRIPTION = "Zsh command line completion support for helm."
LICENSE = "Apache-2.0"

PV = "3.12.2"

RPM_NAME = "helm-zsh-completion-3.12.2-1.1.noarch.rpm"
RPM_HASH = "8bac9d0e0ef9570b071c012877b7e4e0ff4d24807927be536c6f55ce2ae685a5cb31bb64607c6cbf29258eb888efeebf1faac59c33d149e8a98382e33b18dcf6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "helm-zsh-completion"

RDEPENDS:${PN} += "helm"

inherit rpm
